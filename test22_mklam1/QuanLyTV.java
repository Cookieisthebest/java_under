package test22_mklam1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyTV {

    private List<TaiLieu> list = new ArrayList<>();

    public QuanLyTV() {
    }

    public List<TaiLieu> getList() {
        return list;
    }

    public void setList(List<TaiLieu> list) {
        this.list = list;
    }

    
    //ten nhaXB, so ban PH, thang
    public void nhapTapChi(Scanner in){
        String ten = in.nextLine();
        int soban = Integer.parseInt(in.nextLine());
        String th = in.nextLine();
        TapChi v = new TapChi(ten,soban,th);
        v.setMa();
        this.getList().add(v);
    }
    //ten sach, tac gia, tenNhaXB, soBanPH
    public void nhapSach(Scanner in){
        Sach v = new Sach(in.nextLine(), in.nextLine(),in.nextLine(), Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine()));
        v.setMa();
        this.getList().add(v);
    }
    public void out(){
        for(TaiLieu i : list)
        {
            System.out.println(i);
        }
    }

    
}