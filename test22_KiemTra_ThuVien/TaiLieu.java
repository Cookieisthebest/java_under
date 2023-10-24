package test22_KiemTra_ThuVien;

public class TaiLieu {
	private String ma = "";
	private String tenNhaXB = "";
	private int soBanPH = 0;
	private int soAnPham = 0;
	public static int stt = 1;
	
	TaiLieu()
	{
		
	}
	TaiLieu(String tenNhaXB, int soBanPH)
	{
		this.tenNhaXB = tenNhaXB;
		this.soBanPH = soBanPH;
	}
	public void setMa()
	{
		
	}
        public void setMa(String ma)
	{
		this.ma = ma;
		stt++;
	}
        
	public String getMa()
	{
		return ma;
	}
        
	public String getTenNhaXB()
	{
		return tenNhaXB;
	}
	public void setTenNhaXB(String tenNhaXB)
	{
		this.tenNhaXB = tenNhaXB;
	}
	public int getSoBanPH()
	{
		return soBanPH;
	}
	public void setSoBanPH(int soBanPH)
	{
		this.soBanPH = soBanPH;
	}
}
