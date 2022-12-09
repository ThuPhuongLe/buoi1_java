package bai4;

import java.util.Scanner;

public class RunMainGiaoVien {
    public static CBGV[] gv = new CBGV[100];

    public static void main(String[] args) {
        int n;
        do {
            System.out.println("\nChon 1 trong cac chuc nang sau:"+
                    "\n1. Them can bo giao vien" +
                    "\n2. Xoa can bo giao vien" +
                    "\n3. Hien thi thong tin can bo giao vien" +
                    "\n4. Thoat khoi chuong trinh!");
            n = new Scanner(System.in).nextInt();
            switch (n){
                case 1:
                    System.out.println("them can bo giao vien thu "+(t+1));
                    add();
                    break;
                case 2:
                    if (check()) {
                        delete();
                        System.out.println("Bang thong tin CBGV sau khi xoa:");
                        System.out.printf("%-20s %-10s %-20s %-20s %-20s %-20s %-20s %-20s\n"
                                , "Ten CBGV", "Tuoi", "Que quan", "Ma so", "Luong cung", "Luong thuong", "Luong phat", "Luong thuc");
                        show();
                    } else System.out.println("chua co CBGV nao duoc nhap vao!");
                    break;
                case 3:
                    if (check()) {
                        System.out.printf("%-20s %-10s %-20s %-20s %-20s %-20s %-20s %-20s\n"
                                , "Ten CBGV", "Tuoi", "Que quan", "Ma so", "Luong cung", "Luong thuong", "Luong phat", "Luong thuc");
                        show();
                    } else System.out.println("chua co CBGV nao duoc nhap vao!");
                    break;
                case 4:
                    System.out.println("thoat khoi chuong trinh!");
                    System.exit(0);
                default:
                    System.out.println("khong phai lua chon trong menu!");
            }
        } while (true);
    }

    static int t = 0;

    public static void add(){
        gv[t] = new CBGV();
        gv[t].input();
        t++;
    }

    public static void delete(){
        System.out.println("nhap ma so can xoa:");
        int f = new Scanner(System.in).nextInt();
        for (int i = 0; i < t; i++){
            if(gv[i].getThongtin().getMaSo() == f) {
                for (int j = i; j < t-1; j++){
                    gv[j] = gv[j+1];
                }
                t--;
            }
        }
    }

    public static void show(){
        for (int i = 0; i < t; i++){
            gv[i].output();
        }
    }

    public static boolean check(){
        if(t == 0){
            return false;
        } return true;
    }
}
