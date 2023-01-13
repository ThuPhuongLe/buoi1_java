package Cau2;

import java.util.Scanner;

public class Person {
    protected String ten;
    protected int tuoi;
    protected String sdt;
    protected String gioitinh;

    Person(){}

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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ten:");
        setTen(sc.nextLine());
        System.out.println("tuoi:");
        setTuoi(sc.nextInt());
        sc.nextLine();
        System.out.println("so dien thoai:");
        setSdt(sc.nextLine());
        System.out.println("gioi tinh:");
        setGioitinh(sc.nextLine());
    }
}
