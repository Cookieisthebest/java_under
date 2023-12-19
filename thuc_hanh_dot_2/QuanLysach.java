package thuc_hanh_dot_2;

import java.util.ArrayList;
import java.util.Comparator;

import java.util.Iterator;

import java.util.List;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLysach {

    private List<SachHoc> list = new ArrayList<>();

    public QuanLysach() {
    }

    public List<SachHoc> getList() {
        return list;
    }

    public void setList(List<SachHoc> list) {
        this.list = list;
    }
    //ma, ten, nhaxb, loai coban/nangcao, 

    public void nhapSachThamKhao(Scanner in) {
        SachThamKhao v = new SachThamKhao(in.nextLine(), in.nextLine(), Boolean.parseBoolean(in.nextLine()), Double.parseDouble(in.nextLine()));
        v.setMa();
        list.add(v);
    }
    //ten, nhaxb, lop, tap,baitap, gia

    public void nhapSachGiaoKhoa(Scanner in) {
        SachGiaoKhoa v = new SachGiaoKhoa(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()), Boolean.parseBoolean(in.nextLine()), Double.parseDouble(in.nextLine()));
        v.setMa();
        list.add(v);
    }

    public void out() {
        for (SachHoc i : list) {
            System.out.println(i);
        }
    }

    //câu 3: sắp xếp sách giáo khao theo tên nhà xuất bản , sau đó đến giá (bài thực hành của mk)
    //câu 3: bài ktra Ánh là xóa
    public void sapXepSachGiaoKhoa() {
        List<SachGiaoKhoa> mang = new ArrayList<>();
        for (SachHoc i : list) {
            if (i instanceof SachGiaoKhoa) {
                mang.add((SachGiaoKhoa) i);
            }
        }
        mang.sort(new Comparator<SachGiaoKhoa>() {
            @Override
            public int compare(SachGiaoKhoa o1, SachGiaoKhoa o2) {
                if (o1.getNhaXB() != o2.getNhaXB()) {
                    return o1.getNhaXB().compareTo(o2.getNhaXB());
                }
                return Double.compare(o1.getGia(), o2.getGia());
            }
        });
        for (SachGiaoKhoa i : mang) {
            System.out.println(i);
        }

    }
 //cau 4: Thống kê nhà xuất bản với loại cơ bản/nâng cao được nhập vào của sách tham khảo có số lượng ??


    public void demNhaXB(boolean loai) {
        List<SachThamKhao> ls = new ArrayList<>();
        for (SachHoc i : list) {
            if (i instanceof SachThamKhao) {
                if (((SachThamKhao) i).isLoai() == loai) {
                    ls.add((SachThamKhao) i);
                }
            }
        }
        Map<String, Long> mp;
        mp = ls.stream().collect(Collectors.groupingBy(SachThamKhao::getNhaXB, Collectors.counting()));
        Iterator<String> it = mp.keySet().iterator();
        while (it.hasNext()) {
            String k = it.next();
            System.out.println(k + ":" + mp.get(k));
        }

    }
}
//