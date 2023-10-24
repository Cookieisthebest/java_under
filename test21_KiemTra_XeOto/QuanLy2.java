/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package controller;
package test21_KiemTra_XeOto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import model.Oto;
//import model.PTGT;
//import model.XeTai;

/**
 *
 * @author DucGiang
 */
public class QuanLy2 {
    private List<PTGT> list;
    public QuanLy2() {
        list = new ArrayList<>();
    }
    
    public QuanLy2(List<PTGT> list) {
        this.list = list;
    }

    public List<PTGT> getList() {
        return list;
    }

    public void setList(List<PTGT> list) {
        this.list = list;
    }
    public void nhapOto(Scanner in) {
        String hang = in.nextLine();
        String ngayLanBanh = in.nextLine();
        double giaGoc = Double.parseDouble(in.nextLine());
        int soCho = Integer.parseInt(in.nextLine());
        double dongCo = Double.parseDouble(in.nextLine());
        Oto o = new Oto(hang , ngayLanBanh , giaGoc , soCho , dongCo);
        list.add(o);
    }

    public void nhapXeTai(Scanner in) {
        String hang = in.nextLine();
        String ngayLanBanh = in.nextLine();
        double giaGoc = Double.parseDouble(in.nextLine());
        double trongTai = Double.parseDouble(in.nextLine());
        boolean thung = in.nextBoolean();
        XeTai xt = new XeTai(hang , ngayLanBanh , giaGoc , trongTai , thung);
        list.add(xt);
    }
    public void out() {
        list = getList();
        for (PTGT x : list) {
            if (x instanceof Oto) {
                Oto o = (Oto)x;
                o.setMa();
                System.out.println(o);
            }else if (x instanceof XeTai) {
                XeTai xt = (XeTai)x;
                xt.setMa();
                System.out.println(xt);
            }
        }
    }
}
