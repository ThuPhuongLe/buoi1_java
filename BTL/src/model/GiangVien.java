package model;

import java.util.Scanner;

public class GiangVien {
    private String id;
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String khoa;
    private String trinhDo;
    private String username;

    public GiangVien(){}

    public GiangVien(String id, String hoTen, int tuoi, String gioiTinh, String khoa, String trinhDo, String username) {
        this.id = id;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
        this.trinhDo = trinhDo;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    @Override
    public String toString() {
        return "GiangVien{" +
                "id='" + id + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", khoa='" + khoa + '\'' +
                ", trinhDo='" + trinhDo + '\'' +
                '}';
    }
}
