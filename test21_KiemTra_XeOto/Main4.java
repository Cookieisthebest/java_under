/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package view;
package test21_KiemTra_XeOto;

//import controller.Data;
//import controller.QuanLy3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//import model.Oto;
//import model.PTGT;

/**
 *
 * @author DucGiang
 */
public class Main4 {
    public static void main(String[] args) {
        Data x = new Data();
        List<PTGT> list = x.getData();
        List<Oto> oto = new ArrayList<>();
        for (PTGT i : list) {
            if (i instanceof Oto) {
                Oto xt = (Oto) i;
                oto.add(xt);
            }
        }
        oto.sort(new Comparator<Oto>(){
            @Override
            public int compare(Oto o1, Oto o2) {
                if (o1.getSoNgay() != o2.getSoNgay()) {
                    if (o1.getSoNgay() > o2.getSoNgay()) return -1;
                    else return 1;
                } else {
                    if (o1.getGiaBan() < o2.getGiaBan()) return -1;
                    else if (o1.getGiaBan() > o2.getGiaBan()) return 1;
                    else return 0;
                }
            }
        });
        for (Oto o : oto) {
            System.out.println(o);
        }
    }
}
