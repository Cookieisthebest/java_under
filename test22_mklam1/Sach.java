package test22_mklam1;

public class Sach extends TaiLieu implements ITaiLieu {

    private String tenSach, tenTG;
    private int soTrang;

    public Sach() {

    }

    public Sach(String tenSach, String tenTG, String tenNhaXB, int soTrang, int soBanPH) {
        super(tenNhaXB, soBanPH);
        this.tenSach = tenSach;
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

//    @Override
//    public void setMa() {
//        super.setMa(); 
//    }
    @Override
    public void setMa() {
        String k = "";
        String[] s = tenTG.split("\\s");
        k = s[s.length - 1].toUpperCase() + String.format("%03d", stt);
        super.setMa(k);
        //return s[s.length-1].toUpperCase() + super.getMa();
    }

    @Override
    public String getMa() {
//        String[] s = tenTG.split("\\s");
//        return s[s.length-1].toUpperCase() + super.getMa();
        return super.getMa();
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

    @Override
    public int getSoAnPham() {
        int result = 0;
        if (super.getSoBanPH() >= 0 && super.getSoBanPH() <= 200) {
            result = super.getSoBanPH() * 5 / 100;
        } else if (super.getSoBanPH() >= 201 && super.getSoBanPH() <= 500) {
            result = super.getSoBanPH() * 8 / 100;
        } else {
            result = super.getSoBanPH() * 10 / 100;
        }

        if (super.getTenNhaXB().equals("giao duc")) {
            result = result - result * 2 / 100;
        }
        return result;
    }

    //ma, ten sach, tac gia, tenNhaXB, soBanPH
    @Override
    public String toString() {
        return super.getMa() + " " + this.getTenSach() + " "
                + this.getTenTG() + " " + super.getTenNhaXB()
                + " " + super.getSoBanPH() + " " + this.getSoAnPham();
    }

}
