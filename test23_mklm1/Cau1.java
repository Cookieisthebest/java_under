package test23_mklm1;

public class Cau1 {
    public static void main(String[] args) {
        SachThamKhao k=new SachThamKhao("toan lop 5","giao duc", true, 50);
        k.setMa();
        System.out.println(k);
        SachGiaoKhoa g=new SachGiaoKhoa("tieng Viet", "dong nai", 4, 1, false, 80);
        g.setMa();
        System.out.println(g);
    }
}