package test26_KiemTraTuLieu_mkLam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QuanLyTuLieu {

    private List<TuLieu> list = new ArrayList<>();

    public QuanLyTuLieu() {
    }

    public List<TuLieu> getList() {
        return list;
    }

    public void setList(List<TuLieu> list) {
        this.list = list;
//        for(int i = 0 ; i < list.size();i++)
//        {
//            list.get(i).setMa();
//        }
    }
    //ten, tennhaxb, ngay, gia, so luong

    public void nhapBao(Scanner in){
        Bao v = new Bao(in.nextLine(),in.nextLine(),in.nextLine(),Double.parseDouble(in.nextLine()),Integer.parseInt(in.nextLine()));
       v.setMa();
        list.add(v);
    }
   //ten, tenTg, so trang, ten nha xb , gia, so luong
 
    public void nhapSachHoc(Scanner in)
    {
        SachHoc v= new SachHoc(in.nextLine(),in.nextLine(),Integer.parseInt(in.nextLine()),in.nextLine(),Double.parseDouble(in.nextLine()),Integer.parseInt(in.nextLine()));
        v.setMa();
        list.add(v);
    }
    public void out(){
        for(TuLieu i : list){
            System.out.println(i);
        }
    }
    public void sapxepBaoTheoNgay(int k){
        
    }
         
}