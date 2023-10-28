package ktra1;

import ktra1.ISach;
import ktra1.SachGiaoKhoa;
import ktra1.SachHoc;

public class SachThamKhao extends SachHoc implements ISach {

    private boolean loai;

    public SachThamKhao() {
    }

    public SachThamKhao(String ten, String nxb, boolean loai, double gia) {
        super(ten, nxb, gia);
        this.loai = loai;
        if (loai) {
            gia = gia * 1.1;
        } else {
            gia = gia * 1.15;
        }
        super.setGia(gia);
    }

    public boolean isLoai() {
        return loai;
    }

    public void setLoai(boolean loai) {
        this.loai = loai;
    }

    public void setMa() {
        String nxb = this.getNhaXB();
        String[] arr = nxb.split(" ");
        String ma = arr[0].substring(0, 1).toUpperCase() + arr[1].substring(0, 1).toUpperCase()
                + String.format("%02d", cnt++);
        super.setMa(ma);
    }

    @Override
    public String toString() {
        return super.getMa() + " " + super.getTen() + " " + super.getNhaXB() + " "
                + ((this.loai == true) ? "co ban" : "nang cao") + " " + String.format("%.0f", super.getGia());
    }
}
