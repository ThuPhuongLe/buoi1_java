
package service.imp;

import model.TaiKhoan;
import service.TaiKhoanService;


import java.util.Scanner;

public class TaiKhoanServiceImp implements TaiKhoanService {

    @Override
    public void input(TaiKhoan tk) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" + Nhap tai khoan ");
        System.out.print(" username : ");
        tk.setUsername(scanner.nextLine());

        System.out.print(" password : ");
        tk.setPassword(scanner.nextLine());

        //define create role is user , but role of admin create in database
        tk.setRole("user");
    }

}
