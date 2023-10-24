package test20_NganHang_mkLam;

public class GiaoDichVang extends GiaoDich implements IGiaoDich{

    private String loaiVang;

    public GiaoDichVang( String ngay, double gia, int soluong,String loaiVang) {
        super(ngay, gia, soluong);
        this.loaiVang = loaiVang;
    }
//ham tao

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }
    
//cau 1
    public String getLoaiVang() {
        return loaiVang;
    }

    @Override
    public String getMa() {
        return "V-" + super.getMa(); 
    }
     
    @Override
    public double getThanhTien() {
        return super.getGia() * super.getSoluong();
    }
    
    @Override
    public String toString(){
        return getMa() + "\t" + super.getNgay() 
                +"\t" +super.getGia()+"\t"+super.getSoluong()
                        +"\t"+ this.getLoaiVang()+"\t"+this.getThanhTien();
        
    }

    
}