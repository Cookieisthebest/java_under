package ktra1;

import ktra1.ISach;
import ktra1.SachGiaoKhoa;
import ktra1.SachThamKhao;

public class SachHoc {

    private String ma;
    private String ten;
    private String nhaXB;
    static int cnt = 1;
    private double gia;

    public SachHoc() {
    }

    public SachHoc(String ten, String nhaXB, double gia) {
        this.ten = ten;
        this.nhaXB = nhaXB;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public double getGia() {
        return gia;
    }

}
