/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test20_1_ThuVien;

import java.util.Date;

/**
 *
 * @author hungn
 */
public class Bao extends TaiLieu {

    private Date ngayPhatHanh;

    public Bao(Date ngayPhatHanh, String maTaiLieu, String tenNXB, int soBanPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Date getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    @Override
    public String toString() {
        return getMaTaiLieu() + " " + getTenNXB() + " " + getSoBanPhatHanh() + " " + getNgayPhatHanh();
    }

}

//1
//1
//Bao1
//Kim Dong
//100000
//17/10/2023
//1
//1
//Bao2
//Lam Sung
//100000
//17/10/2023
//1
//1
//Bao3
//Ly By
//100000
//17/10/2023
//1
//1
//Bao4
//Luc Van Tien
//100000
//17/10/2023
//3
