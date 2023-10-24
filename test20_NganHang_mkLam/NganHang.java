package test20_NganHang_mkLam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class NganHang implements ChucNang {

    List<GiaoDich> list = new ArrayList<>();

    public NganHang() {
        // list = new ArrayList<>();
//        GiaoDichVang v = new GiaoDichVang("1/1/2022", 100, 10, "24k");
//        v.setMa();
//        list.add(v);
//        v = new GiaoDichVang("12/10/2023", 200, 20, "9999");
//        v.setMa();
//        list.add(v);
//        GiaoDichTT t = new GiaoDichTT("13/09/2022", 100, 10, 1, "VND");
//        t.setMa();
//        list.add(t);
    }
// ------------------------------------------------------------------------------------------------------

//cau 2 ------------------------------------------------------------------------------------------------------
//    public NganHang() {
//    }
    private GiaoDich nhap(Scanner in) {
        return new GiaoDich(in.nextLine(), Double.parseDouble(in.nextLine()), Integer.parseInt(in.nextLine()));
    }

    //ngay giao dich, don gia,so luong,loaivang
    @Override
    public void nhapGDVang(Scanner in) {
        GiaoDich d = nhap(in);
        GiaoDichVang v = new GiaoDichVang(d.getNgay(), d.getGia(), d.getSoluong(), in.nextLine());
        v.setMa();
        list.add(v);
    }

    //ngay giao dich, don gia,so luong,tigia,loaitien
    @Override
    public void NhapGDTT(Scanner in) {
        GiaoDich d = nhap(in);
        GiaoDichTT v = new GiaoDichTT(d.getNgay(), d.getGia(), d.getSoluong(), 0, "");
        v.setMa();
        String loaitien = in.nextLine().toUpperCase();
        v.setLoaiTien(loaitien);
        double tigia = 1;
        if (loaitien.equalsIgnoreCase("vnd")) {
            tigia = 1;
        } else {
            tigia = Double.parseDouble(in.nextLine());
        }
        v.setTigia(tigia);
        list.add(v);
    }

    @Override
    public void out() {
        for (GiaoDich i : list) {
            System.out.println(i);
        }
    }

//cau 31 ------------------------------------------------------------------------------------------------------   
    //HÀM TẠO Ở TRƯỚC CÂU 1 : public NganHang() được dùng ở đây
    private int getGDByMa(String ma) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).getMa().equals(ma)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void xoa(String ma) {
        int pos = getGDByMa(ma);
        if (pos == -1) {
            System.out.println("thay dau ma xoa");
        } else {
            list.remove(pos);
            System.out.println("xoa thanh cong!!!");
        }
    }

//cau 32------------------------------------------------------------------------------------------------------
    @Override
    public void suaGDVang(String ma) {
        List<GiaoDichVang> lvang = new ArrayList<>();
        for (GiaoDich i : list) {
            if (i instanceof GiaoDichVang) {
                lvang.add((GiaoDichVang) i);
            }
        }
        Scanner in=new Scanner(System.in);

//ngay giao dich, don gia,so luong,loaivang
        for (GiaoDichVang i : lvang) {
            if (i.getMa().equalsIgnoreCase(ma)) {
                i.setNgay(in.nextLine());
                i.setGia(Double.parseDouble(in.nextLine()));
                i.setSoluong(Integer.parseInt(in.nextLine()));
                i.setLoaiVang(in.nextLine());
                for(GiaoDichVang j : lvang){
                    System.out.println(j);
                }
                return;
            }
        }
        System.out.println("khong tim thay");

    }

//cau 41------------------------------------------------------------------------------------------------------
    @Override
    public void timTheoLoaiVang(String key) {
         List<GiaoDichVang> lvang = new ArrayList<>();
        for (GiaoDich i : list) {
            if (i instanceof GiaoDichVang) {
                lvang.add((GiaoDichVang) i);
            }
        }
        for(GiaoDichVang i : lvang)
        {
            if(i.getLoaiVang().equalsIgnoreCase(key))
            {
                 System.out.println(i);
                 return;
            }
        }
        System.out.println("khong tim thay");
    }

//cau 42------------------------------------------------------------------------------------------------------    
    @Override
    public void timGDVangTuGiaDenGia(double tu, double den) {
         List<GiaoDichVang> lvang = new ArrayList<>();
        for (GiaoDich i : list) {
            if (i instanceof GiaoDichVang) {
                lvang.add((GiaoDichVang) i);
            }
        }
        int k =0;
        for(int i = 0;i < lvang.size();i++)
        {
            if(lvang.get(i).getGia() >= tu && lvang.get(i).getGia() <= den ){
                System.out.println(lvang.get(i));
                k++;
            }
        }
        if(k == 0) System.out.println("Khong tim thay");
    }

//cau 43------------------------------------------------------------------------------------------------------    
    @Override
    public void sapxepTheoMa() {
        Collections.sort(list, new Comparator<GiaoDich>(){
            @Override
            public int compare(GiaoDich t1,GiaoDich t2){
                return t2.getMa().compareTo(t1.getMa());
            }
        });
    }

    @Override
    public void sapxepTheoGiaTang() {
        Collections.sort(list, new Comparator<GiaoDich>(){
            @Override
            public int compare(GiaoDich t1,GiaoDich t2){
                return Double.compare(t1.getGia(), t2.getGia());
            }
        });
    }

    @Override
    public void sapxepTheoSoLuongGiam() {
        Collections.sort(list, new Comparator<GiaoDich>(){
            @Override
            public int compare(GiaoDich t1,GiaoDich t2){
                return t2.getSoluong()-t1.getSoluong();
            }
        });
    }

}
