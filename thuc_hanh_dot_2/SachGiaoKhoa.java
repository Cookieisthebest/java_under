package thuc_hanh_dot_2;

public class SachGiaoKhoa extends SachHoc implements ISach {

    private int lop;
    private int tap;
    private boolean baitap;

    public SachGiaoKhoa() {
    }
//ten, nhaxb, lop, tap,baitap, 
    public SachGiaoKhoa(String ten, String nhaXB, int lop, int tap, boolean baitap, double gia) {
        super(ten, nhaXB, gia);
        this.lop = lop;
        this.tap = tap;
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

    public void setLop(int lop) {
        this.lop = lop;
    }

    public void setTap(int tap) {
        this.tap = tap;
    }

    public void setBaitap(boolean baitap) {
        this.baitap = baitap;
    }
    //

    @Override
    public void setMa() {
        super.setMa(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getMa() {
        return "SGK" + lop + tap + super.getMa();
    }

    @Override
    public double getGia() {
        double gia = super.getGia();
        if (lop >= 1 && lop <= 5) {
            gia *= 0.9;
        } else if (lop >= 6 && lop <= 9) {
            gia *= 0.95;
        }
        
        if(this.isBaitap() == true) gia *= 1.05;
        return gia;
    }
    //ma, ten, nha xb, coban/nang cao, gia 

    @Override
    public String toString() {
        return this.getMa() + " " + super.getTen()
                + " " + super.getNhaXB() + " " + this.getLop() + " "
                + this.getTap() + " " + ((this.isBaitap() == true) ? "bai tap" : "ly thuyet")
                +" "+ Math.round(this.getGia());
    }

}
