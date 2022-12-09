package bai2;

import java.util.Scanner;

public class KhoiThi {
    private String khoiA;
    private String khoiB;
    private String khoiC;
    private char khoi;

    public KhoiThi(){}

    public char getKhoi() {
        return khoi;
    }

    public void setKhoi(char khoi) {
        while (khoi != 'A' && khoi != 'B' && khoi != 'C'){
            khoi = new Scanner(System.in).next().charAt(0);
        }
        this.khoi = khoi;
    }

    public String getKhoiA() {
        this.khoiA = "Toan, Ly, Hoa";
        return khoiA;
    }

    public String getKhoiB() {
        this.khoiB = "Toan, Hoa, Sinh";
        return khoiB;
    }

    public String getKhoiC() {
        this.khoiC = "Van, Su, Dia";
        return khoiC;
    }

    public void input(){
        System.out.println("nhap khoi thi:");
        setKhoi(new Scanner(System.in).next().charAt(0));
    }

    public String output(){
        if(getKhoi()=='A')
            return getKhoiA();
        else if(getKhoi()=='B')
            return getKhoiB();
        else return getKhoiC();
    }
}
