/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test20_1_ThuVien;

/**
 *
 * @author hungn
 */
public class Sach extends TaiLieu {
    private String tenTacGia, tenSach;
    private int soTrangSach;

    public Sach(String tenTacGia, String tenSach, int soTrangSach, String maTaiLieu, String tenNXB, int soBanPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.tenSach = tenSach;
        this.soTrangSach = soTrangSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public int getSoTrangSach() {
        return soTrangSach;
    }

    @Override
    public String toString() {
        return getMaTaiLieu() + " " + getTenNXB() + " " + getSoBanPhatHanh() + " " + getTenTacGia() + " " + getTenSach() + " " + getSoTrangSach();
    }


}
