package test27_ThucHanh_TaoLopThiSinh_;


import java.util.Scanner;

class ThiSinh {
    private String ma, ten, dt, khuvuc, kq;
    private double toan, ly, hoa, giai, ut, tong;

    public ThiSinh(String ma, String ten, String dt, double toan, double ly, double hoa, double giai) {
        this.ma = ma;
        this.ten = ten;
        this.dt = dt;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.giai = giai;
        
        tong = toan + ly + hoa;
        ut = 0;
        khuvuc = ma.substring(0, 3);
        
        if(khuvuc.equals("KV2")){
            ut += 1;
        }
        if(khuvuc.equals("KV3")){
            ut += 2;
        }
        
        if(dt.toUpperCase().equals("KINH") == false){
            ut += 1;
        }
        
        if(giai == 1){
            ut += 1.5;
        }
        if(giai == 2){
            ut += 1;
        }
        if(giai == 3){
            ut += 0.5;
        }
        
        if(tong + ut >= 26.8){
            kq = "TRUNG TUYEN";
        }else{
            kq = "TRUOT";
        }
    }
    
    @Override
    public String toString(){
        String s1, s2;
        if(tong == (int)tong){
            s1 = String.valueOf((int)tong);
        }else{
            s1 = String.valueOf(tong);
        }
        if(ut == (int)ut){
            s2 = String.valueOf((int)ut);
        }else{
            s2 = String.valueOf(ut);
        }
        return ma + " " + ten + " " + s2 + " " + s1 + " " + kq;
    }
}

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ThiSinh[] ds = new ThiSinh[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String dt = sc.nextLine();
            ds[i] = new ThiSinh(ma, ten, dt, sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        for(int i = 0; i < n; i++){
            System.out.println(ds[i]);
        }
    }
}

/*
2
KV2A002
To An An
kinh
9
9
7
0
KV1A004
Lo Van Lo
Tay
9
9.2
9
3
*/