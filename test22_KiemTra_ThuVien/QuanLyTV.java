package test22_KiemTra_ThuVien;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyTV extends TaiLieu {
	private ArrayList<TaiLieu> list = new ArrayList<>();
	
	QuanLyTV()
	{
		
	}
        
	public void nhapTapChi(Scanner in)
	{
		String tenNhaXB = in.nextLine();
		int soBanPH = in.nextInt();
		in.nextLine();
		String thang = in.nextLine();
		TaiLieu tmp = new TapChi(tenNhaXB, soBanPH, thang);
		list.add(tmp);
	}
        
	public void nhapSach(Scanner in)
	{
		String tenSach = in.nextLine();
		String tenTG = in.nextLine();
		String tenNhaXB = in.nextLine();
		int soTrang = in.nextInt();
		int soBanPH = in.nextInt();
		TaiLieu tmp = (new Sach(tenSach, tenTG, tenNhaXB, soTrang, soBanPH));
		list.add(tmp);
	}
        
	public void out()
	{
		for(TaiLieu x:list)
		{
			x.setMa();
			System.out.println(x);
		}
	}
}
