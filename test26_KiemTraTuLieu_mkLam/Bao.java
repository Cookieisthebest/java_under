package test26_KiemTraTuLieu_mkLam;

public class Bao extends TuLieu implements ITuLieu {

    private String ngay,ten;
//ten, tennhaxb, ngay, gia, so luong
    public Bao( String ten, String tenNhaXB,String ngay, double gia, int soLuong) {
        super(tenNhaXB, gia, soLuong);
        this.ngay = ngay;
        this.ten = ten;
    }

    public String getNgay() {
        return ngay;
    }

    public String getTen() {
        return ten;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public void setMa() {
        super.setMa();
        String s = this.getTen().substring(0, 1).toUpperCase();
        s += super.getMa();
        super.setMa(s);
    }
 //ma, ten bao, ngay xuat ban, ten Nha xb, gia

    @Override
    public double getGia(){
        double re = 0;
        int k = Integer.parseInt(this.getNgay().substring(3, 5));
        if(this.getSoLuong() > 200) {
            re = super.getGia() - super.getGia()*5/100;
        }else re = super.getGia();
        if( k <= 2) re = re - re *5/100;
        return re;
    }
    
    @Override
    public String toString() {
        this.setMa();
        return this.getMa()+" "+this.getTen()+" "+
                this.getNgay()+" "+this.getTenNhaXB()
                +" "+(int) getGia();
    }
    
   

}