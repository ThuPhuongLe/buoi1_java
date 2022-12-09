package bai3;

import java.util.Scanner;

public class Lop {
    private String maLop;
    private String tenLop;

    public Lop(){}

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap ma lop:");
        setMaLop(sc.nextLine());

        System.out.println("nhap ten lop:");
        setTenLop(sc.nextLine());
    }
}
