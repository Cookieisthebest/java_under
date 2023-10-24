package test23_KiemTra_QuanLySach;
//package model;

public class SachGiaoKhoa extends sachHoc implements iSach{
    private int lop,tap;
    private boolean baitap;

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(  String ten, String nhaXB,int lop,int tap, boolean baitap, double gia) {
        super(ten, nhaXB, gia);
        this.lop = lop;
        this.tap = tap;
        this.baitap = baitap;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public int getTap() {
        return tap;
    }

    public void setTap(int tap) {
        this.tap = tap;
    }

    public boolean isBaitap() {
        return baitap;
    }

    public void setBaitap(boolean baitap) {
        this.baitap = baitap;
    }
    @Override
    public void setMa(){
        super.setMa();
        super.setMa("SGK"+lop+tap+super.getMa());
    }
    @Override
       public double getGia(){
          if(isBaitap()){
               if(lop<=5) return (super.getGia()-super.getGia()*0.1)+(super.getGia()-super.getGia()*0.1)*0.05;
           else if(lop>5&&lop<=9) {
               return (super.getGia()-super.getGia()*0.05)+(super.getGia()-super.getGia()*0.05)*0.05;
           }
          }
          else{
               if(lop<=5) return super.getGia()-super.getGia()*0.1;
           else if(lop>5&&lop<=9) return super.getGia()-super.getGia()*0.05;
           
          
       }
        return 0;
          }


    @Override
    public String toString() {
        String loai;
        if (isBaitap()) {
            loai = "bai tap";
        } else {
            loai = "ly thuyet";
        }

        return super.getMa() + " " + super.getTen() + " " + super.getNhaXB() + " " + getLop() + " " + getTap() + " " + loai + " " +(int) getGia();
    }
}
