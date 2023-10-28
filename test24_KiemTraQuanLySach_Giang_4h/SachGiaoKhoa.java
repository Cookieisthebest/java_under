package ktra1;

import ktra1.ISach;
import ktra1.SachThamKhao;
import ktra1.SachHoc;

public class SachGiaoKhoa extends SachHoc implements ISach {

    private int lop;
    private int tap;
    private boolean baitap;

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(String ten, String nhaXB, int lop, int tap, boolean baitap, double gia) {
        super(ten, nhaXB, gia);
        this.lop = lop;
        this.tap = tap;
        this.baitap = baitap;
        if (lop <= 5) {
            gia = gia - gia * 0.1;
        } else if (lop <= 9) {
            gia = gia - gia * 0.15;
        }
        if (baitap) {
            gia = gia + gia * 0.05;
        }
        super.setGia(gia);
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public void setTap(int tap) {
        this.tap = tap;
    }

    public void setBaitap(boolean baitap) {
        this.baitap = baitap;
    }

    public int getLop() {
        return lop;
    }

    public int getTap() {
        return tap;
    }

    public boolean isBaitap() {
        return baitap;
    }

    public void setMa() {
        String ma = "SGK" + this.lop + this.tap + String.format("%02d", cnt++);
        super.setMa(ma);
    }

    @Override
    public String toString() {
        return super.getMa() + " " + super.getTen() + " " + super.getNhaXB() + " " + this.lop + " " + this.tap + " "
                + ((this.baitap == true) ? "bai tap" : "ly thuyet") + " " + String.format("%.0f", super.getGia());
    }

}
