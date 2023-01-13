package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMainHocSinh {
    static int t = 0;

    public static HocSinh[] hs = new HocSinh[100];

    public static void main(String[] args) {
        int n = 0;
        do {
            System.out.println("nhap lua chon: 1 -> 6" +
            "\n1. Them hoc sinh moi" +
            "\n2. Xuat ra thong tin cac hoc sinh" +
            "\n3. Hien thi cac hoc sinh 20 tuoi" +
            "\n4. So luong cac hoc sinh co tuoi 23 va que o DN" +
            "\n5. Sap xep sinh vien tang dan theo que quan" +
            "\n6. Ket thuc chuong trinh");
            n = new Scanner(System.in).nextInt();
            switch (n){
                case 1:
                    add();
                    break;
                case 2:
                    if (check()) {
                        System.out.printf("%-20s %-10s %-20s %-20s %-20s\n"
                                , "Ten", "Tuoi", "Que quan", "Ma lop", "Ten lop");
                        show();
                    } else System.out.println("Chua co hoc sinh nao duoc nhap vao!");
                    break;
                case 3:
                    if (check()) {
                        System.out.printf("%-20s %-10s %-20s %-20s %-20s\n"
                                , "Ten", "Tuoi", "Que quan", "Ma lop", "Ten lop");
                        show20();
                    } else System.out.println("Chua co hoc sinh nao duoc nhap vao!");
                    break;
                case 4:
                    if (check()) {
                        System.out.println("so hoc sinh co tuoi 23 va que o DN la: " + Count23DN());
                    } else System.out.println("Chua co hoc sinh nao duoc nhap vao!");
                    break;
                case 5:
                    if (check()) {
                        System.out.printf("%-20s %-10s %-20s %-20s %-20s\n"
                                , "Ten", "Tuoi", "Que quan", "Ma lop", "Ten lop");
                        sapXep();
                        show();
                    } else System.out.println("Chua co hoc sinh nao duoc nhap vao!");
                    break;
                case 6:
                    System.out.println("thoat khoi chuong trinh!");
                    System.exit(0);
                default:
                    System.out.println("khong phai lua chon trong menu");
            }
        } while (true);
    }

    public static boolean check(){
        if(t == 0){
            return false;
        } return true;
    }

    public static void add(){
        hs[t] = new HocSinh();
        hs[t].input();
        t++;
    }

    public static void show(){
        for (int i=0; i<t; i++){
            hs[i].output();
        }
    }

    public static void show20(){
        int k = 0;
        for (int i=0; i<t; i++){
            if (hs[i].getTuoi() == 20) {
                hs[i].output();
                k++;
            }
        }
        if (k==0)
            System.out.println("khong co hoc sinh nao 20 tuoi");
    }

    public static int Count23DN(){
        int k = 0;
        for (int i=0; i<t; i++){
            if(hs[i].getTuoi() == 23 && hs[i].getQue().equals("DN"))
                k++;
        }
        return k;
    }

    public static void sapXep(){
        for (int i=0; i<t-1; i++){
            for (int j=i+1; j<t; j++){
                if(hs[i].getQue().compareToIgnoreCase(hs[j].getQue()) > 0){
                    HocSinh tmp = hs[i];
                    hs[i] = hs[j];
                    hs[j] = tmp;
                }
            }
        }
    }

}
