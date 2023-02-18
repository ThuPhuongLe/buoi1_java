package main;

import java.sql.SQLException;
import java.util.Scanner;

import static java.lang.System.exit;
import static main.MainGiangVien.logIn;
import static main.MainGiangVien.register;
import static main.MainTaiKhoan.forgotPassword;

public class RunMain {
    public static void main(String[] args) throws SQLException {

        do {
            System.out.println("==> CÁC CHỨC NĂNG <==");
            System.out.println("1.Đăng nhập");
            System.out.println("2.Đăng kí");
            System.out.println("3.Quên mật khẩu");
            System.out.println("4.Exit");
            System.out.print(" Nhập lựa chọn của bạn : ");
            int chose = new Scanner(System.in).nextInt();

            switch (chose) {
                case 1: {
                    logIn();
                    break;
                }
                case 2: {
                    register();
                    break;
                }
                case 3: {
                    forgotPassword();
                    break;
                }
                case 4: {
                    exit(0);
                    break;
                }
            }
        }while (true);
        }
    }

