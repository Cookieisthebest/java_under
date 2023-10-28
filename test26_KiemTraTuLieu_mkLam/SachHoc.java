package test26_KiemTraTuLieu_mkLam;

public class SachHoc extends TuLieu implements ITuLieu {

    private String ten, tenTG;
    private int soTrang;

    public SachHoc() {
    }
//ten, tenTg, so trang, ten nha xb , gia, so luong

    public SachHoc(String ten, String tenTG, int soTrang, String tenNhaXB, double gia, int soLuong) {
        super(tenNhaXB, gia, soLuong);
        this.ten = ten;
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    public String getTen() {
        return ten;
    }

    public String getTenTG() {
        return tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public void setMa() {
        super.setMa();
        String[] b = this.getTen().split("\\s");
        String s = b[0].toUpperCase();
        s += super.getMa();
        super.setMa(s);
    }
//ma, ten , ten nha XB, so Trang,gia

    @Override
    public double getGia() {
        double re = 0;
        if (this.getSoTrang() <= 300) {
            re = super.getGia() - super.getGia() * 5 / 100;
        } else if (this.getSoTrang() <= 301 && this.getSoTrang() >= 500) {
            re = super.getGia() - super.getGia() * 10 / 100;

        } else {
            re = super.getGia() - super.getGia() * 15 / 100;
        }
        if(this.getSoLuong() > 500) re = re - re * 10/100;
        return re;
    }

    @Override
    public String toString() {
        this.setMa();
        return super.getMa() + " " + this.getTen() + " "
                + this.getTenNhaXB() + " " + this.getSoTrang()
                + " "+(int)this.getGia();

    }

}
