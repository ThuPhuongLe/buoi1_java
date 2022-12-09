package bai3;

import java.util.Scanner;

public class HocSinh {
    private String ten;
    private int tuoi;
    private String que;
    private Lop lop = new Lop();

    public HocSinh() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten sinh vien:");
        setTen(sc.nextLine());

        System.out.println("nhap tuoi sinh vien:");
        setTuoi(sc.nextInt());

        sc.nextLine();
        System.out.println("nhap que quan sinh vien:");
        setQue(sc.nextLine());

        lop.input();
    }

    public void output(){
        System.out.printf("%-20s %-10d %-20s %-20s %-20s\n"
        , getTen(), getTuoi(), getQue(), lop.getMaLop(), lop.getTenLop());
    }
}
