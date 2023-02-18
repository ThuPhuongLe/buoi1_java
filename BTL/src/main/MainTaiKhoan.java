package main;

import dao.TaiKhoanDAO;
import model.TaiKhoan;

import java.util.List;
import java.util.Scanner;

import static dao.GiangVienDAO.getName;

public class MainTaiKhoan {
    public static List<TaiKhoan> listTk() {
        TaiKhoanDAO taiKhoanDAO = new TaiKhoanDAO();
        return taiKhoanDAO.getAccount();
    }

    public static void forgotPassword() {
        System.out.println("Nhap username : ");
        String username = new Scanner(System.in).next();
        if (getName(username) != null) {
            System.out.println("Nhap password moi : ");
            String password = new Scanner(System.in).next();
            TaiKhoanDAO taiKhoanDAO = new TaiKhoanDAO();
            taiKhoanDAO.updatePassword(username, password);
            System.out.println("Cap nhat mat khau thanh cong!");
        } else
            System.out.println("username khong ton tai!");
    }
}
