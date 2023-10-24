package test22_mklam1;

public class Cau1 {

    public static void main(String[] args) {
        //ten nha xban, soBanPH, thang
        TapChi g = new TapChi("KHCNTT TT",250,"10/2023");
        g.setMa();
        System.out.println(g);
        //ten Sach, ten TG, tenNhaXB,soTrang, sobanPH
        //kệ con mẹ số Trang =)))
        Sach t = new Sach("LT HDT","Nguyen manh son","giao duc",333,1000);
        t.setMa();
        System.out.println(t);
    }
}
