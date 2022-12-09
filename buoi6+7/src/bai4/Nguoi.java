package bai4;

import java.util.Scanner;

public class Nguoi {
    private String ten;
    private int tuoi;
    private String que;
    private int maSo;

    public Nguoi(){

    }

    public static Scanner sc = new Scanner(System.in);

    public void setTen(String ten){
        this.ten = ten;
    }

    public String getTen(){
        return ten;
    }

    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }

    public int getTuoi(){
        return tuoi;
    }

    public void setQue(String que){
        this.que = que;
    }

    public String getQue(){
        return que;
    }

    public void setMaSo(int maSo){
        this.maSo = maSo;
    }

    public int getMaSo(){
        return maSo;
    }

    public void input(){
        System.out.println("nhap ten can bo giao vien:");
        setTen(sc.nextLine());

        System.out.println("nhap tuoi can bo giao vien:");
        setTuoi(sc.nextInt());

        sc.nextLine();
        System.out.println("nhap que quan can bo giao vien:");
        setQue(sc.nextLine());

        System.out.println("nhap ma so can bo giao vien:");
        setMaSo(sc.nextInt());
        sc.nextLine();
    }
}
