package bai2;

import java.util.Scanner;

public class ThiSinh {
    private int sbd;
    private String ten;
    private String diaChi;
    private String mucUt;
    private KhoiThi khoiThi = new KhoiThi();

    public ThiSinh(){}

    public int getSbd() {
        return sbd;
    }

    public void setSbd(int sbd) {
        this.sbd = sbd;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMucUt() {
        return mucUt;
    }

    public void setMucUt(String mucUt) {
        this.mucUt = mucUt;
    }

    public void input(){

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten:");
        setTen(sc.nextLine());

        System.out.println("nhap so bao danh:");
        setSbd(sc.nextInt());

        sc.nextLine();
        System.out.println("nhap dia chi:");
        setDiaChi(sc.nextLine());

        System.out.println("nhap muc uu tien:");
        setMucUt(sc.nextLine());

        khoiThi.input();
    }

    public void output(){
        System.out.printf("%-10d %-20s %-15s %-10s %-20s\n"
        , getSbd(), getTen(), getDiaChi(), getMucUt(), khoiThi.output());
    }
}
