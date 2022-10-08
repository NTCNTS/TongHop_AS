package com.example.tonghop_linh;

public class Game {
    private String Ten;
    private String MoTa;
    private String Gia;
    private int Hinh;

    public Game(String ten, String moTa, String gia, int hinh) {
        this.Ten = ten;
        this.MoTa = moTa;
        this.Gia = gia;
        this.Hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String gia) {
        Gia = gia;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
