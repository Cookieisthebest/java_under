/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test20_1_ThuVien;

/**
 *
 * @author hungn
 */
public class TapChi extends TaiLieu {
    private String soPhatHanh, thangPhatHanh;

    public TapChi(String soPhatHanh, String thangPhatHanh, String maTaiLieu, String tenNXB, int soBanPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public String getThangPhatHanh() {
        return thangPhatHanh;
    }

    @Override
    public String toString() {
        return getMaTaiLieu() + " " + getTenNXB() + " " + getSoBanPhatHanh() + " " + getSoPhatHanh() + " " + getThangPhatHanh();
    }


}
