package test23_mklm1;

public class SachHoc {
    private String ma,ten;
    private String nhaXB;
    private double gia;
    public static int stt = 1;
//ten, nhaXB,gia
    public SachHoc(String ten, String nhaXB, double gia) {
        this.ten = ten;
        this.nhaXB = nhaXB;
        this.gia = gia;
    }

    public SachHoc() {
    }

    public String getTen() {
        return ten;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public double getGia() {
        return gia;
    }

    public void setMa(String ma) {
        this.ma = ma;
        stt++;
    }
    public void setMa() {
        this.ma = String.format("%02d", stt++);
    }

    public String getMa() {
        return ma;
    }
    

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    

}