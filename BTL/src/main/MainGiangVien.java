package main;

import dao.GiangVienDAO;
import dao.TaiKhoanDAO;
import model.GiangVien;
import model.TaiKhoan;
import service.TaiKhoanService;
import service.imp.GiangVienServiceImp;
import service.imp.TaiKhoanServiceImp;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


import static dao.GiangVienDAO.getName;
import static main.MainTaiKhoan.listTk;

public class MainGiangVien {
        static Scanner scanner = new Scanner(System.in);

        static void logIn() throws SQLException {
            System.out.println(" Nhap your username : ");
            String username = scanner.nextLine();

            System.out.println(" Nhap password cua ban: ");
            String password = scanner.nextLine();
            boolean check = false;
            for (TaiKhoan tk : listTk()) {
                //Login and manage function
                if (tk.getRole().equals("admin") && tk.getUsername().equals(username) && tk.getPassword().equals(password)) {
                    System.out.println(" Dang nhap duoi quyen Admin thanh cong!");
                    int ad;
                    do {
                        System.out.println(" Cac chuc nang ");
                        System.out.println("1.Them GiangVien");
                        System.out.println("2.Xoa GiangVien bang Id");
                        System.out.println("3.Tim GiangVien bang HoTen ");
                        System.out.println("4.Tim GiangVien by Id");
                        System.out.println("5.Danh sach GiangVien");
                        System.out.println("6.Exit ");
                        System.out.println(" Nhap lua chon :  ");
                        ad = scanner.nextInt();
                        scanner.nextLine();
                        switch (ad) {
                            case 1: {
                                addGv();
                                break;
                            }
                            case 2: {
                                deleteGvById();
                                break;
                            }
                            case 3: {
                                findGvByName();
                                break;
                            }
                            case 4: {
                                findGvById();
                                break;
                            }
                            case 5: {
                                ListGv();
                                break;
                            }
                        }
                    } while (ad != 6);
                    check = true;
                    break;
                }
                if (tk.getRole().equals("user") && tk.getUsername().equals(username) && tk.getPassword().equals(password)) {
                    System.out.println(" Chao " + getName(username));
                    int us;
                    do {
                        System.out.println(" Cac chuc nang: ");
                        System.out.println("1.Sua lai thong tin ");
                        System.out.println("2.Kiem tra thong tin cua ban ");
                        System.out.println("3.Thoat ");
                        System.out.print(" Nhap lua chon cua ban :  ");
                        us = scanner.nextInt();
                        scanner.nextLine();
                        switch (us) {
                            case 1: {
                                editInfoGv(username);
                                break;
                            }
                            case 2: {
                                showMyInfor(username);
                                break;
                            }
                        }
                    } while (us != 3);
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("Tai khoan khong ton tai!");
            }
        }

        public static void register() throws SQLException {
            //Enter information for student
            GiangVienServiceImp gvImp = new GiangVienServiceImp();
            GiangVienDAO giangVienDAO = new GiangVienDAO();
            TaiKhoanService tkGV = new TaiKhoanServiceImp();
            TaiKhoanDAO taiKhoanDAO = new TaiKhoanDAO();
            TaiKhoan tk = new TaiKhoan();
            GiangVien gv = new GiangVien();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap Id:");
            gv.setId(scanner.nextLine());
            if (giangVienDAO.find(gv.getId()) != null && giangVienDAO.find(gv.getId()).getUsername() == null) {
                System.out.println("Id nay da ton tai!\nHay nhap thong tin cua ban de kiem tra:");
                System.out.println("Ho ten:");
                gv.setHoTen(scanner.nextLine());
                if (gv.getHoTen().equals(giangVienDAO.find(gv.getId()).getHoTen())) {
                    System.out.println("Ban da co thong tin, tiep tuc tao tai khoan:");
                    tkGV.input(tk);
                    taiKhoanDAO.add(tk);
                    giangVienDAO.addUsername(gv.getId(), tk.getUsername());
                    System.out.println("Tao tai khoan thanh cong!");
                } else System.out.println("Ten ban nhap khong dung!\n Tao tai khoan that bai!");
            }
            else if (giangVienDAO.find(gv.getId()) != null && giangVienDAO.find(gv.getId()).getUsername() != null)
                System.out.println("Tai khoan nay da ton tai! Hay dang nhap de su dung chuc nang!");

                else {
                        gvImp.input(gv);
                        tkGV.input(tk);
                        taiKhoanDAO.add(tk);

                        gv.setUsername(tk.getUsername());
                        giangVienDAO.add(gv, gv.getUsername());
                        System.out.println("Tao tai khoan thanh cong!");
                    }
        }

        public static void addGv() throws SQLException{
            GiangVienDAO giangVienDAO = new GiangVienDAO();
            GiangVien gv = new GiangVien();
            GiangVienServiceImp giangVienService = new GiangVienServiceImp();
            System.out.println("Nhap thong tin giang vien can them");
            giangVienService.input(gv);
            giangVienDAO.add(gv, null);
            System.out.println("Them giang vien thanh cong!");
        }

        public static void deleteGvById() throws SQLException {
            GiangVienDAO giangVienDAO = new GiangVienDAO();
            System.out.println(" Chon Id giang vien can xoa :");
            //remove student
            String Id = scanner.nextLine();
            GiangVien gv = GiangVienDAO.find(Id);
            if (gv != null) {
                giangVienDAO.delete(Id);
                //Remove Account
                TaiKhoanDAO tkDAO = new TaiKhoanDAO();
                tkDAO.deleteAccount(gv.getUsername());
                System.out.println("Xoa giang vien co Id = " + Id + " thanh cong!");
            } else {
                System.out.println("Khong tim thay giang vien co Id = " + Id);
            }
        }

        public static void findGvByName() {
            GiangVienDAO giangVienDAO = new GiangVienDAO();
            GiangVienServiceImp giangVienServiceImp = new GiangVienServiceImp();
            System.out.println(" Nhap ten giang vien muon tim : ");
            String name = scanner.nextLine();
            try {
                List<GiangVien> LstGV = giangVienDAO.findGvByName(name);
                if (!LstGV.isEmpty()) {
                    title();
                    for (GiangVien gv : LstGV)
                        giangVienServiceImp.output(gv);
                    } else{
                        System.out.println("Khong tim thay giang vien nao co ten : " + name);
                    }
                } catch(SQLException throwables){
                    throwables.printStackTrace();
                }
            }

            public static void findGvById () {
                GiangVienDAO giangVienDAO = new GiangVienDAO();
                GiangVienServiceImp giangVienServiceImp = new GiangVienServiceImp();
                System.out.println(" Nhap Id giang vien muon tim : ");
                String Id = scanner.nextLine();
                try {
                    GiangVien gv = giangVienDAO.find(Id);
                    if (gv != null) {
                        title();
                        giangVienServiceImp.output(gv);
                    } else {
                        System.out.println("Khong tim duoc giang vien co Id : " + Id);
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            public static void ListGv () {
                GiangVienDAO giangVienDAO = new GiangVienDAO();
                GiangVienServiceImp giangVienServiceImp = new GiangVienServiceImp();
                try {
                    List<GiangVien> LstGV = giangVienDAO.findAll();
                    System.out.println("Danh sach giang vien ");
                    title();
                    for (GiangVien gv : LstGV) {
                        giangVienServiceImp.output(gv);
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            public static void editInfoGv (String username) throws SQLException {
                Scanner scanner = new Scanner(System.in);
                GiangVienDAO giangVienDAO = new GiangVienDAO();
                GiangVien gv = new GiangVien();
                System.out.println("Nhap ho ten : ");
                gv.setHoTen(scanner.nextLine());

                System.out.println("Nhap tuoi  : ");
                gv.setTuoi(scanner.nextInt());
                scanner.nextLine();

                System.out.println("Nhap gioi tinh: ");
                gv.setGioiTinh(scanner.nextLine());

                System.out.println("Nhap khoa: ");
                gv.setKhoa(scanner.nextLine());

                System.out.println("Nhap trinh do: ");
                gv.setTrinhDo(scanner.nextLine());

                giangVienDAO.update(gv, username);
                System.out.println("Cap nhat thanh cong!");

            }

            public static void showMyInfor (String username) throws SQLException {
                GiangVienDAO giangVienDAO = new GiangVienDAO();
                GiangVien gv = giangVienDAO.find(giangVienDAO.getId(username));
                GiangVienServiceImp giangVienServiceImp = new GiangVienServiceImp();
                title();
                giangVienServiceImp.output(gv);
            }

            public static void title(){
                System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                        "Id", "Ho Ten", "Tuoi", "Gioi Tinh", "Khoa", "Trinh Do", "username");
            }

        }

