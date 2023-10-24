/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package controller;
package test21_KiemTra_XeOto;

import java.util.ArrayList;
import java.util.List;
//import model.Oto;
//import model.PTGT;
//import model.XeTai;

/**
 *
 * @author Admin
 */
public class QuanLy3 {
    private List<PTGT> list;
    public QuanLy3() {
        list = new ArrayList<>();
    }
    
    public QuanLy3(List<PTGT> list) {
        this.list = list;
    }

    public List<PTGT> getList() {
        return list;
    }

    public void setList(List<PTGT> list) {
        this.list = list;
    }
    public void timXeTaiTheoNam(int nam , boolean thung) {
        Data x = new Data();
        List<PTGT> list = x.getData();
        for (PTGT i : list) {
            if (i instanceof XeTai) {
                XeTai iXT = (XeTai)i;
                if (iXT.getNamLanBanh().equals(String.valueOf(nam)) && iXT.isThung() == thung) {
                    System.out.println(iXT);
                }
            }
        }
    }
    public void out() {
        Data x = new Data();
        List<PTGT> list = x.getData();
        for (PTGT i : list) {
            if (i instanceof Oto) {
                Oto io = (Oto)i;
                System.out.println(i);
            }
        }
    }
    
}
