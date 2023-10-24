
package test20_NganHang_mkLam;

import java.util.Scanner;

public interface ChucNang {
    public void nhapGDVang(Scanner in);
    public void NhapGDTT(Scanner in);
    public void out();
    public void xoa(String ma);
    public void suaGDVang(String ma);
    public void timTheoLoaiVang(String key);
    public void timGDVangTuGiaDenGia(double tu,double den);
    public void sapxepTheoMa();//giam dan
    public void sapxepTheoGiaTang();//tang dan
    public void sapxepTheoSoLuongGiam();//giam dan

}
