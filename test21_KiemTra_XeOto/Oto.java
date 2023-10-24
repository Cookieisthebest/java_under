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
public class Oto extends PTGT implements IPTGT{
    private int soCho;
    private double dongCo;
    private String maOto;
    public Oto() {
    }

    public Oto(String hang, String ngayLanBanh, double giaGoc, int soCho, double dongCo ) {
        super(hang, ngayLanBanh, giaGoc);
        this.soCho = soCho;
        this.dongCo = dongCo;
    }
    @Override
    public void setMa() {
        String s = super.getHang();
        int stt = super.getNum();
        maOto = s.substring(0 , 2).toUpperCase() + "-" + String.format("%03d", stt);
        super.tangNum();
    }
    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public double getDongCo() {
        return dongCo;
    }

    public void setDongCo(double dongCo) {
        this.dongCo = dongCo;
    }
    @Override
    public String toString() {
        return maOto + " " + super.getHang() + " " + super.getNgayLanBanh() + " " + soCho + " " + (int)getGiaBan();
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
        }else if (yearCL >= 1 && yearCL <= 2) {
            giaBan = super.getGiaGoc() - 0.1 * super.getGiaGoc();
        } else if (yearCL >= 3 && yearCL <= 5) {
            giaBan = super.getGiaGoc() - 0.2 * super.getGiaGoc();
        } else {
            giaBan = super.getGiaGoc() - 0.3 * super.getGiaGoc();
        }
        return giaBan;
    }
    public int getSoNgay() {
        String s = getNgayLanBanh();
        String [] arr = s.split("/");
        int SLngay = 0;
        SLngay = Integer.parseInt(arr[arr.length - 1]) * 365 + Integer.parseInt(arr[0]) * 30;
        return SLngay;
    }
}
