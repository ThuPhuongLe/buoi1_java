package service.imp;

import model.GiangVien;
import service.GiangVienService;

import java.util.Scanner;

public class GiangVienServiceImp implements GiangVienService {
    @Override
    public void input(GiangVien gv) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" + Nhap thong tin can thiet ");
        System.out.print(" Id : ");
        gv.setId(scanner.nextLine());

        System.out.print(" Ho ten : ");
        gv.setHoTen(scanner.nextLine());

        System.out.print(" Tuoi : ");
        gv.setTuoi(scanner.nextInt());
        scanner.nextLine();

        System.out.print(" Gioi tinh : ");
        gv.setGioiTinh(scanner.nextLine());

        System.out.print(" Khoa : ");
        gv.setKhoa(scanner.nextLine());

        System.out.print(" Trinh do : ");
        gv.setTrinhDo(scanner.nextLine());

    }

    @Override
    public void output(GiangVien gv) {
        System.out.printf("%-20s %-20s %-20d %-20s %-20s %-20s %-20s\n",
                gv.getId(), gv.getHoTen(), gv.getTuoi(), gv.getGioiTinh(), gv.getKhoa(), gv.getTrinhDo(), gv.getUsername());
    }
}