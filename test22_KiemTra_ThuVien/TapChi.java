package test22_KiemTra_ThuVien;

public class TapChi extends TaiLieu implements ITaiLieu {
	private String thang = "";
	
	TapChi()
	{
		
	}
	TapChi(String tenNhaXB, int soBanPH, String thang)
	{
		setTenNhaXB(tenNhaXB);
		setSoBanPH(soBanPH);
		this.thang = thang;
	}
        //@Override
	public void setMa()
	{
		String[] split = getTenNhaXB().split("\\s+");
		String ma = "";
		for(String x:split)
		{
			ma = ma + Character.toUpperCase(x.charAt(0));
		}
		ma = ma + String.format("%03d", stt);
		setMa(ma);
	}
	public String getThang()
	{
		return thang;
	}
	public void setThang(String thang)
	{
		this.thang = thang;
	}
	@Override
	public int getSoAnPham() {
		int result = getSoBanPH();
		if(getSoBanPH() > 200)
		{
			result = result*8/100;
		}
		else if(getSoBanPH() >= 101 && getSoBanPH() <= 200)
		{
			result = result*5/100;
		}
		else if(getSoBanPH() <= 100  && getSoBanPH() >= 0)
		{
			result = result*2/100;
		}
		if(getTenNhaXB().equals("KHCNTT TT"))
		{
			result = result + result*2/100;
		}
		return result;
	}
	@Override
	public String toString()
	{
		return getMa() + " " + getTenNhaXB() + " " + getSoBanPH() + " " + thang + " " + getSoAnPham() + "\n";
	}
}
