package Cau2;

import java.util.Scanner;

public class Honey extends Person{
    private int idNguoiYeu;
    private int status;
    private Person person = new Person();

    Honey(){}

    public int getIdNguoiYeu() {
        return idNguoiYeu;
    }

    public void setIdNguoiYeu(int idNguoiYeu) {
        if (idNguoiYeu == 1 || idNguoiYeu ==0)
            this.idNguoiYeu = idNguoiYeu;
        else do {
            System.out.println("nhap lai status 0 va 1:");
            idNguoiYeu = new Scanner(System.in).nextInt();
        } while (idNguoiYeu != 0 && idNguoiYeu != 1);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id nguoi yeu:");
        setIdNguoiYeu(sc.nextInt());

        System.out.println("trang thai yeu:");
        setStatus(sc.nextInt());

        person.input();
    }

    public void output(){
        System.out.printf("%-10d %-10d %-20s %-10d %-20s %-10s"
        , getIdNguoiYeu(), getStatus(), getTen(), getTuoi(), getSdt(), getGioitinh());
    }
}
