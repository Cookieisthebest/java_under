package thuc_hanh_dot_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cau4 {

    public static void main(String[] args) {
        QuanLysach q=new QuanLysach();
        List<SachHoc> list=new ArrayList<>();
        SachThamKhao k=new SachThamKhao("toan lop 6","giao duc", false, 45);
        k.setMa();
        list.add(k);
        k=new SachThamKhao("ly lop 11","dong nai", true, 90);
        k.setMa();
        list.add(k);
        k=new SachThamKhao("Sinh lop 10","dong nai", false, 120);
        k.setMa();
        list.add(k);
        k=new SachThamKhao("Ngu van lop 6","giao duc", true, 200);
        k.setMa();
        list.add(k);
        k=new SachThamKhao("giao duc CD lop 7","Minh chau", true, 60);
        k.setMa();
        list.add(k);
        k=new SachThamKhao("Ngu van lop 8","giao duc", true, 200);
        k.setMa();
        list.add(k);
        SachGiaoKhoa g=new SachGiaoKhoa("toan", "dong nai", 5, 1, true, 50);
        g.setMa();
        list.add(g);
        g=new SachGiaoKhoa("tieng viet", "giao duc", 5, 2, false, 60);
        g.setMa();
        list.add(g);
        q.setList(list);
        Scanner in=new Scanner(System.in);
        q.demNhaXB(Boolean.parseBoolean(in.nextLine()));
    }
}