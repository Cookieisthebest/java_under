/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test23_KiemTra_QuanLySach;

public class sachHoc {
    private String ma,ten,nhaXB;
    private double gia;
    private static int sMa=1;
    public sachHoc() {
    }

    public sachHoc( String ten, String nhaXB, double gia) {
  
        this.ten = ten;
        this.nhaXB = nhaXB;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setMa(){
        this.ma=String.format("%02d",sMa++);
    }
    public void setMa(String ma) {
        this.ma = ma;
    }
        
    public String getMa() {
        return ma;
    }
}
