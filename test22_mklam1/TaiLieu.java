package test22_mklam1;

public class TaiLieu {
    String ma;
    private String tenNhaXB;
    private int soBanPH;
    public static int stt = 1;

    public TaiLieu() {
    }
    
    public TaiLieu(String tenNhaXB, int soBanPH) {
        this.tenNhaXB = tenNhaXB;
        this.soBanPH = soBanPH;
    }

    public void setMa(String ma) {
        this.ma = ma;
        stt++;
    }
    public void setMa() {
       // this.ma =String.format("%03d", stt++);
       
    }

    public String getMa() {
        return this.ma;
    }

    public String getTenNhaXB() {
        return tenNhaXB;
    }

    public void setTenNhaXB(String tenNhaXB) {
        this.tenNhaXB = tenNhaXB;
    }

    public int getSoBanPH() {
        return soBanPH;
    }

    public void setSoBanPH(int soBanPH) {
        this.soBanPH = soBanPH;
    }
  
}