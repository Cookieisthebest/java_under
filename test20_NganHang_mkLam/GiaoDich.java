package test20_NganHang_mkLam;

public class GiaoDich {

    //ma giao dich , ngay giao dich, don gia,so luong
    private String ma, ngay;
    private double gia;
    private int soluong;
    public static int sMa =1 ;

    public GiaoDich(String ngay, double gia, int soluong) {
        this.ngay = ngay;
        this.gia = gia;
        this.soluong = soluong;
    }
//cau 1:
    public String getNgay() {
        return ngay;
    }
    
    public double getGia() {
        return gia;
    }

    public int getSoluong() {
        return soluong;
    }
    
   // public static int sMa = 1;
    public void setMa() {
        this.ma = String.format("%03d", sMa++);
    }

    public String getMa() {
        return ma;
    }
//setter dùng cho câu 32, ko cần viết lại vào lớp con

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
