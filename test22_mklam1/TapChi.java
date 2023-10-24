package test22_mklam1;

public class TapChi extends TaiLieu implements ITaiLieu {

    private String thang;

    public TapChi() {
    }

    public TapChi(String tenNhaXB, int soBanPH, String thang) {
        super(tenNhaXB, soBanPH);
        this.thang = thang;
    }

    @Override
    public void setMa() {
          //   super.setMa();
        String s = "";
        String[] b = super.getTenNhaXB().split("\\s");
        for (int i = 0; i < b.length; i++) {
            s += b[i].charAt(0);
        }
        s = s.toUpperCase() + String.format("%03d", stt);
        super.setMa(s);        
    }

    @Override
    public String getMa() {
//        String s = "";
//        String[] b = super.getTenNhaXB().split("\\s");
//        for (int i = 0; i < b.length; i++) {
//            s += b[i].charAt(0);
//        }
//        return s.toUpperCase() + super.getMa();
return super.getMa();
    }

    public String getThang() {
        return thang;
    }

    public void setThang(String thang) {
        this.thang = thang;
    }

    
    @Override
    public int getSoAnPham() {
        int result = 0;
        if (super.getSoBanPH() >= 0 && super.getSoBanPH() <= 100) {
            result = super.getSoBanPH() * 2 / 100;
        } else if (super.getSoBanPH() >= 101 && super.getSoBanPH() <= 200) {
            result = super.getSoBanPH() * 5 / 100;
        } else {
            result = super.getSoBanPH() * 8 / 100;
        }

        if (super.getTenNhaXB().equals("KHCNTT TT")) {
            result = result + result * 2 / 100;
        }
        return result;
    }

    //ma , ten nha XB, soBanPH, thang,so an pham 
    @Override
    public String toString() {
        return this.getMa() + " " + super.getTenNhaXB() + " "
                + super.getSoBanPH() + " " + this.getThang()
                + " "+this.getSoAnPham();
    }
}
