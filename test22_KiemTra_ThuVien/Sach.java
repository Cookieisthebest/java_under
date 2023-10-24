package test22_KiemTra_ThuVien;

public class Sach extends TaiLieu implements ITaiLieu {

    private String tenSach = "";
    private String tenTG = "";
    private int soTrang = 0;

    Sach() {

    }

    Sach(String tenSach, String tenTG, String tenNhaXB, int soTrang, int soBanPH) {
        this.tenSach = tenSach;
        this.tenTG = tenTG;
        setTenNhaXB(tenNhaXB);
        this.soTrang = soTrang;
        setSoBanPH(soBanPH);
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTenTG() {
        return tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

 //   @Override
    public void setMa() {
        String ma = "";
        String[] split = getTenTG().split("\\s+");
        ma = ma + split[split.length - 1].toUpperCase() + String.format("%03d", stt);
        setMa(ma);
    }

    @Override
    public int getSoAnPham() {
        int result = getSoBanPH();
        if (getSoBanPH() > 500) {
            result = result * 10 / 100;
        } else if (getSoBanPH() >= 201 && getSoBanPH() <= 500) {
            result = result * 8 / 100;
        } else if (getSoBanPH() <= 200 && getSoBanPH() >= 0) {
            result = result * 5 / 100;
        }
        if (getTenNhaXB().equals("giao duc")) {
            result = result - result * 2 / 100;
        }
        return result;
    }

    @Override
    public String toString() {
        return getMa() + " " + tenSach + " " + tenTG + " " + getTenNhaXB() + " " + getSoBanPH() + " " + getSoAnPham() + "\n";
    }
}
