package test23_mklm1;

public class SachGiaoKhoa extends SachHoc implements ISach{
    private int lop,tap;
    private boolean baitap;

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa( String ten, String nhaXB,int lop, int tap, boolean baitap, double gia) {
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
    public boolean isBaitap(){
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
    public String theloai(){
        if(this.isBaitap() == true) return "bai tap";
        else return "ly thuyet";
    }

    @Override
    public void setMa() {
        super.setMa(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getMa() {
        return "SGK" + lop + tap+ super.getMa();
    }

    @Override
    public double getGia() {
        double re =0;
        if(lop >= 1 && this.getLop() <= 5)
        {
            re = super.getGia() - super.getGia() * 10/100;
        }
        else if(this.getLop() >= 6 && this.getLop() <= 9){
            re = super.getGia() - super.getGia()*5/100;
        }
        if(this.isBaitap() == true) re = re + re *5/100;
        return re;        
    }
    
    
    //ma, ten,nhaXb,lop,tap,baitap/lithuyet,gia
    @Override
    public String toString()
    {
        return this.getMa()+" "+super.getTen()+" "
                +super.getNhaXB()+" "+this.getLop()+" "+this.getTap()+
                " "+this.theloai()+" "+String.format("%.0f", this.getGia());
    }

    
    
    
}