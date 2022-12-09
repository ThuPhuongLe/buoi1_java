package bai4;

import java.util.Scanner;

public class CBGV {
    private long luongCung;
    private long luongThuong;
    private long luongPhat;
    private Nguoi thongtin = new Nguoi();

    public CBGV(){

    }

    public Nguoi getThongtin() {
        return thongtin;
    }

    public long getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(long luongCung) {
        this.luongCung = luongCung;
    }

    public long getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(long luongThuong) {
        this.luongThuong = luongThuong;
    }

    public long getLuongPhat() {
        return luongPhat;
    }

    public void setLuongPhat(long luongPhat) {
        this.luongPhat = luongPhat;
    }

    public long luongThuc(){
        return luongCung + luongThuong - luongPhat;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);

        thongtin.input();

        System.out.println("nhap luong cung:");
        setLuongCung(sc.nextLong());

        System.out.println("nhap luong thuong:");
        setLuongThuong(sc.nextLong());

        System.out.println("nhap luong phat:");
        setLuongPhat(sc.nextLong());
        sc.nextLine();
    }

    public void output(){
        System.out.printf("%-20s %-10d %-20s %-20d %-20d %-20d %-20d %-20d\n"
        , thongtin.getTen(), thongtin.getTuoi(), thongtin.getQue(), thongtin.getMaSo(), getLuongCung(), getLuongThuong(), getLuongPhat(), luongThuc());
    }
}
