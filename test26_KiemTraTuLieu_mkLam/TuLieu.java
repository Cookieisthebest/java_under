package test26_KiemTraTuLieu_mkLam;

public class TuLieu {

    private String ma,tenNhaXB;
    private double gia;
    private int soLuong;
    public static int stt =1;

    public TuLieu() {
    }
//tennhaxb, gia, soluong
    public TuLieu(String tenNhaXB, double gia, int soLuong) {
        this.tenNhaXB = tenNhaXB;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getTenNhaXB() {
        return tenNhaXB;
    }

    public double getGia() {
        return gia;
    }

    public int getSoLuong() {
        return soLuong;
    }
///////////////
    public void setMa(){
        this.ma= String.format("%03d", stt++);
    }
    
    public void setMa(String ma) {
        this.ma = ma;
    }
    public String getMa() {
        return ma;
    }
//////////////////////
    public void setTenNhaXB(String tenNhaXB) {
        this.tenNhaXB = tenNhaXB;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
}