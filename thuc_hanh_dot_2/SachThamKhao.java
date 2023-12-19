package thuc_hanh_dot_2;

public class SachThamKhao extends SachHoc implements ISach {

    private boolean loai;

    public SachThamKhao() {
    }

    public SachThamKhao(String ten, String nhaXB, boolean loai, double gia) {
        super(ten, nhaXB, gia);
        this.loai = loai;
    }

    public boolean isLoai() {
        return loai;
    }

    public void setLoai(boolean loai) {
        this.loai = loai;
    }

    @Override
    public void setMa() {
        super.setMa(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getMa() {
        String[] s = this.getNhaXB().split("\\s");
        String b = "";
        for (int i = 0; i < s.length; i++) {
            b += s[i].charAt(0);
        }
        return b.toUpperCase() + super.getMa();
    }

    @Override
    public double getGia() {
        double re = 0;
        if (this.isLoai()) {
            re = super.getGia() + super.getGia() * 10 / 100;
        } else {
            re = super.getGia() + super.getGia() * 15 / 100;
        }
        return re;

    }
//ma, ten, nhaxb, loai coban/nangcao, 
    @Override
    public String toString() {
        return this.getMa() + " " + super.getTen() + " "
                + super.getNhaXB() + " " + ((this.isLoai() == true) ? "co ban" : "nang cao")
                + " "+Math.round(this.getGia());
    }

}
