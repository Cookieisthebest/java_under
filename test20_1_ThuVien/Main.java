/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test20_1_ThuVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hungn
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        List<TaiLieu> list = new ArrayList<>();
        List<String> maArr = new ArrayList<>();
        while (true) {
            System.out.println("""
                1. Nhap du lieu cua tai lieu
                2. Xoa tai lieu
                3. In ra cac tai lieu
                4. Tim kiem tai lieu theo cac tieu chi
                5. Sap xep theo ...
                6. Thong ke
                0. Thoat
                Hay chon so tu 0 den 6
            """);
            int options = Integer.parseInt(sc.nextLine());
            switch (options) {
                case 1 -> {
                    System.out.println("""
                        1. Nhap du lieu bao
                        2. Nhap du lieu sach
                        3. Nhap du lieu tap chi
                                                           """);
                    int opt = Integer.parseInt(sc.nextLine());
                    String maTL;
                    while (true) {
                        System.out.println("Nhap ma tai lieu");
                        maTL = sc.nextLine();
                        if (maArr.isEmpty()) {
                            maArr.add(maTL);
                            break;
                        } else {
                            if (maArr.contains(maTL)) {
                                System.out.println("Ma tai lieu bi trung, vui long nhap lai");
                            } else {
                                maArr.add(maTL);
                                break;
                            }
                        }
                    }
                    System.out.println("Nhap ten nha xuat ban");
                    String nxb = sc.nextLine();
                    System.out.println("Nhap so ban phat hanh");
                    int soBanPH = Integer.parseInt(sc.nextLine());
                    switch (opt) {
                        case 1 -> {
                            SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
                            System.out.println("Nhap ngay phat hanh Bao");
                            Date dateBao = fm.parse(sc.nextLine());
                            list.add(new Bao(dateBao, maTL, nxb, soBanPH));
                        }
                        case 2 -> {
                            System.out.println("Nhap ten tac gia");
                            String tenTG = sc.nextLine();
                            System.out.println("Nhap ten sach");
                            String tenSach = sc.nextLine();
                            System.out.println("Nhap so trang");
                            int soTrang = Integer.parseInt(sc.nextLine());
                            list.add(new Sach(tenTG, tenSach, soTrang, maTL, nxb, soBanPH));
                        }
                        case 3 -> {
                            System.out.println("Nhap so phat hanh");
                            String soPH = sc.nextLine();
                            System.out.println("Nhap ten tac gia");
                            String thangPH = sc.nextLine();
                            list.add(new TapChi(soPH, thangPH, maTL, nxb, soBanPH));
                        }
                        default ->
                            System.out.println("Loi");
                    }
                }

                case 2 -> {
                    System.out.println("Nhap ma tai lieu can xoa");
                    String maTLCanXoa = sc.nextLine();
                    int check = 0;
                    for (TaiLieu i : list) {
                        if (i.getMaTaiLieu().equalsIgnoreCase(maTLCanXoa)) {
                            check = 1;
                            list.remove(i);
                            System.out.println("Da xoa tai lieu co ma la: " + i.getMaTaiLieu());
                        }
                    }
                    if (check == 0) {
                        System.out.println("Ma tai lieu khong ton tai");
                    }
                }
                case 3 -> {
                    if (list.size() <= 0) {
                        System.out.println("Khong co du lieu ve tai lieu");
                    } else {
                        System.out.println("Danh sach tai lieu la: ");
                        for (TaiLieu i : list) {
                            System.out.println(i);
                        }
                    }
                    System.out.println("Tong so tai lieu: " + list.size());
                }
                case 4 -> {
                }
                case 5 -> {
                    System.out.println("""
                        1. Sap xep theo ten nha xuat ban
                        2. Sap xep theo so trang
                        3. Sap xep theo ngay phat hanh
                                                           """);
                    int op = Integer.parseInt(sc.nextLine());
                    switch (op) {
                        case 1 -> {
                            Collections.sort(list, new Comparator<TaiLieu>() {
                                @Override
                                public int compare(TaiLieu o1, TaiLieu o2) {
                                    String[] s1 = o1.getTenNXB().split(" ");
                                    String[] s2 = o2.getTenNXB().split(" ");
                                    if (s1[0].compareToIgnoreCase(s2[0]) == 0) {
                                        return s1[s1.length].compareTo(s2[s2.length]);
                                    } else {
                                        return s1[0].compareTo(s2[0]);
                                    }
                                }
                            });
                            for (TaiLieu i : list) {
                                System.out.println(i);
                            }
                        }
                        case 2 -> {
                        }
                        case 3 -> {
                        }
                        default ->
                            System.out.println("Hay chon tu 1 den 3");
                    }
//                            Collections.sort(list, new Comparator<Sach>() {
//                                @Override
//                                public int compare(Sach o1, Sach o2) {
//                                    return o1.getSoTrangSach() - o2.getSoTrangSach();
//                                }
//                            });
//                            for (Sach i : list) {
//                                System.out.println(i);
//                            }
//                            Collections.sort(list, new Comparator<TaiLieu>() {
//                                @Override
//                                public int compare(TaiLieu o1, TaiLieu o2) {
//                                    String[] s1 = o1.getTenNXB().split("");
//                                    String[] s2 = o2.getTenNXB().split("");
//                                    if (s1[0].compareToIgnoreCase(s2[0]) == 0) {
//                                        return s1[s1.length].compareTo(s2[s2.length]);
//                                    } else {
//                                        return s1[0].compareTo(s2[0]);
//                                    }
//                                }
//                            });
//                            for (TaiLieu i : list) {
//                                System.out.println(i);
//                            }
                }

                case 6 -> {
                    System.out.println("Tong so ban da phat hanh: " + list.size());
                    int countBao = 0;
                    int countTapChi = 0;
                    int countSach = 0;
                    for (TaiLieu i : list) {
                        if (i instanceof Bao) {
                            countBao++;
                        } else if (i instanceof TapChi) {
                            countTapChi++;
                        } else if (i instanceof Sach) {
                            countSach++;
                        }
                    }
                    System.out.println("Tong so bao da phat hanh: " + countBao);
                    System.out.println("Tong so tap chi da phat hanh: " + countTapChi);
                    System.out.println("Tong so sach phat hanh: " + countSach);
                }
                case 0 -> {
                    System.out.println("Tam biet. Hen gap lai");
                    System.exit(0);
                }
                default ->
                    System.out.println("Hay nhap cac so tu 0 den 6");
            }
        }
    }
}
