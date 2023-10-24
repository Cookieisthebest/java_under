package test23_KiemTra_QuanLySach;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import model.ChucNang;
//import model.SachGiaoKhoa;
//import model.SachThamKhao;
//import model.sachHoc;

public class QuanLysach implements ChucNang {

    public Scanner sc = new Scanner(System.in);
    private List<sachHoc> list;

    public QuanLysach() {
        list = new ArrayList<>();
    }

    @Override
    public void nhapSachGiaoKhoa(Scanner sc) {
        //String ten, String nhaXB,int lop,int tap, boolean baitap, double gia
        SachGiaoKhoa v = new SachGiaoKhoa(
                sc.nextLine(),
                sc.nextLine(),
                Integer.parseInt(sc.nextLine()),
                Integer.parseInt(sc.nextLine()),
                Boolean.parseBoolean(sc.nextLine()),
                Double.parseDouble(sc.nextLine())
        );
        v.setMa();
        list.add(v);
    }

    @Override
    public void nhapSachThamKhoa(Scanner sc) {
        //String ten, String nhaXB, boolean loai,double gia
        SachThamKhao v = new SachThamKhao(
                sc.nextLine(),
                sc.nextLine(),
                Boolean.parseBoolean(sc.nextLine()),
                Double.parseDouble(sc.nextLine())
        );
        v.setMa();
        list.add(v);
    }

//    @Override
//    public void out() {
//        for (sachHoc i : list) {
//            if (i instanceof SachThamKhao) {
//                String loai;
//                if (i.isLoai()) {
//                    loai = "co ban";
//                } else {
//                    loai = "nang cao";
//                }
//                return i.getMa() + " " + i.getTen() + " " + i.getNhaXB() + " " + loai + " " + (int) i.getGia();
//            }
//        }
//    }

    @Override
    public void out() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
