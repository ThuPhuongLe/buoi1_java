package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<String> ten = new ArrayList<>();
        System.out.println("nhap so phan tu cua danh sach ten:");
        int n = new Scanner(System.in).nextInt();
        System.out.println("nhap cac chuoi:");
        for (int i = 0; i<n; i++){
            ten.add(new Scanner(System.in).nextLine());
        }

        search(ten);
    }

    public static void search(ArrayList<String> ten){
        System.out.println("nhap chuoi can tim kiem:");
        String chuoi = new Scanner(System.in).nextLine();
        System.out.println("cac chuoi chua chuoi con vua nhap la:");
        int t = 0;
        for (String s : ten)
            if (s.contains(chuoi)) {
                System.out.println(s);
                t++;
            }
        if (t == 0)
            System.out.println("khong co trong danh sach!");
    }
}
