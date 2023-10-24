package test22_KiemTra_ThuVien;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        QuanLyTV q = new QuanLyTV();
        Scanner in = new Scanner(System.in);
        q.nhapTapChi(in);
        q.nhapSach(in);
        q.out();

//ten nha xban, soBanPH, thang
//        TapChi g = new TapChi("KHCNTT TT",250,"10/2023");
//        g.setMa();
//        System.out.println(g);
//        //ten Sach, ten TG, tenNhaXB,soTrang, sobanPH
//        //kệ con mẹ số Trang =)))
//        Sach t = new Sach("LT HDT","Nguyen manh son","giao duc",333,1000);
//        t.setMa();
//        System.out.println(t);
    }
}

//KHCNTT TT
//120
//10/2023
//LT HDT
//Nguyen Manh Son
//giao duc
//120
//1000
