/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package model;
package test21_KiemTra_XeOto;

/**
 *
 * @author Admin
 */
public class XeTai extends PTGT implements IPTGT{
    private double trongTai;
    private boolean thung;
    private String maXeTai;
    public XeTai() {
    }

    public XeTai(String hang, String ngayLanBanh, double giaGoc , double trongTai, boolean thung) {
        super(hang, ngayLanBanh, giaGoc);
        this.trongTai = trongTai;
        this.thung = thung;
    }

    @Override
    public void setMa() {
        int stt = super.getNum();
        maXeTai = "T" + "-" + String.format("%03d", stt);
        super.tangNum();
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public boolean isThung() {
        return thung;
    }

    public void setThung(boolean thung) {
        this.thung = thung;
    }
    
    public String getNamLanBanh() {
        StringBuilder sb = new StringBuilder(super.getNgayLanBanh());
        String yearStr = sb.reverse().toString();
        String yearReverse = yearStr.substring(0 , 4);
        String year = "";
        for (int i = yearReverse.length() - 1 ; i >= 0 ; i--) {
            year += yearReverse.charAt(i);
        }
        return year;
    }
    @Override
    public double getGiaBan() {
        double giaBan;
        StringBuilder sb = new StringBuilder(super.getNgayLanBanh());
        String yearStr = sb.reverse().toString();
        String yearReverse = yearStr.substring(0 , 4);
        String year = "";
        for (int i = yearReverse.length() - 1 ; i >= 0 ; i--) {
            year += yearReverse.charAt(i);
        }
        int yearLB = Integer.parseInt(year);
        int yearCL = 2023 - yearLB;
        if (yearCL == 0) {
            giaBan = super.getGiaGoc() + 0.1 * super.getGiaGoc();
        } else if (yearCL <= 3) {
            giaBan = super.getGiaGoc() - 0.1 * super.getGiaGoc();
        } else {
            giaBan = super.getGiaGoc() - 0.2 * super.getGiaGoc();
        }
        if (thung) {
            giaBan = giaBan + 0.1 * giaBan;
        }
        return giaBan;
    }
    @Override
    public String toString() {
        return maXeTai + " " + super.getHang() + " " + super.getNgayLanBanh() + " " + trongTai + " " + (int)getGiaBan();
    }
}
