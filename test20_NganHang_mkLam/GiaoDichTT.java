package test20_NganHang_mkLam;

public class GiaoDichTT extends GiaoDich implements IGiaoDich{
    private double tigia;
    private String loaiTien;

    public GiaoDichTT(String ngay, double gia, int soluong,double tigia, String loaiTien) {
        super(ngay, gia, soluong);
        this.tigia = tigia;
        this.loaiTien = loaiTien;
    }

//cau 1
    @Override
    public String getMa() {
        return "TT-"+ super.getMa(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public double getTigia() {
        return tigia;
    }

    public String getLoaiTien() {
        return loaiTien;
    }
    
    @Override
    public double getThanhTien() {
        if(this.getLoaiTien().equalsIgnoreCase("VN"))
        {
            return super.getSoluong() * super.getGia();
        }else return super.getSoluong() * super.getGia() * this.getTigia();
    }
    //ham tao

    public void setTigia(double tigia) {
        this.tigia = tigia;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }    
    
    @Override
    public String toString(){
        return getMa()+"\t"+getNgay()+"\t"+
                getGia()+"\t"+getSoluong()+"\t"+getLoaiTien()+"\t"+
                getTigia()+"\t"+getThanhTien();
    }
    

}