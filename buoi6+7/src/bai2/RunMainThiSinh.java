package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMainThiSinh {

    public static ThiSinh[] ts = new ThiSinh[100];

    public static void main(String[] args) {
        int n = 1;
        do {
            System.out.println("Nhap lua chon:" +
                    "\n1.Them moi thi sinh"+
                    "\n2.Hien thi thong tin thi sinh va khoi thi thi sinh"+
                    "\n3. Tim kiem theo so bao danh"+
                    "\n4. Thoat khoi chuong trinh");
            n = new Scanner(System.in).nextInt();
            switch (n) {
                case 1:
                    themMoiThiSinh();
                    break;
                case 2:
                    if (check()) {
                        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n"
                                , "So bao danh", "Ten", "Dia chi", "Muc uu tien", "Khoi thi");
                        hienThi();
                    } else System.out.println("chua co thi sinh nao trong danh sach!");
                    break;
                case 3:
                    if (check()) {
                        timKiem();
                    } else System.out.println("chua co thi sinh nao trong danh sach!");
                    break;
                case 4:
                    System.out.println("Thoat khoi chuong trinh");
                    System.exit(0);
                default:
                    System.out.println("Khong co trong menu");
            }
        } while (true);
    }

    static int t = 0;

    public static void themMoiThiSinh(){
        ts[t] = new ThiSinh();
        ts[t].input();
        t++;
    }

    public static void hienThi(){
        for(int i=0; i<t; i++){
            ts[i].output();
        }
    }

    public static void timKiem(){
        int k = 0;
        System.out.println("nhap so bao danh can tim:");
        k = new Scanner(System.in).nextInt();
        for(int i=0; i<t; i++){
            if(ts[i].getSbd() == k)
                ts[i].output();
        }
    }

    public static boolean check(){
        if(t == 0)
            return false;
        return true;
    }
}
