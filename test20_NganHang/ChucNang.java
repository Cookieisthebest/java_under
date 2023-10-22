
package test20_NganHang;

import java.util.Scanner;


public interface ChucNang {
    //input GD vang, GD tt, out, delete/update/search sort don gian kong kenh
    //thong ke - map
    public void nhapGDVang(Scanner in);
    public void NhapGDTT(Scanner in);
    public void out();
    public void xoa(String ma);
    public void suaGDVang(String ma);
    public void timTheoLoaiVang(String key);
    public void timGDVangTuGiaDenGia(double tu,double den);
    public void sapxepTheoMa();//giam dan theo mã -> getMa
    public void sapxepTheoGiaTang();//tang dan theo giá 
    public void sapxepTheoSoLuongGiam();//giam dan theo số lượng giảm dần
}
