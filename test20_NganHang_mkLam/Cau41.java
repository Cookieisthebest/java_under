package test20_NganHang_mkLam;

import java.util.Scanner;

public class Cau41 {

    public static void main(String[] args) {
        NganHang n = new NganHang();
//n.out();
        Scanner in = new Scanner(System.in);
        String loaivang = in.nextLine();
        n.timTheoLoaiVang(loaivang);
    }

}

