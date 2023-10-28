package test27_ThucHanh_TaoLopThiSinh_;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;



class ThiSinh {
    private String ma, ten, dt, khuvuc, kq;
    private double toan, ly, hoa, giai, ut, tong, sum;

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
        
        sum = tong + ut;
        
        if(tong + ut >= 26.8){
            kq = "TRUNG TUYEN";
        }else{
            kq = "TRUOT";
        }
    }
    
    public double getSum(){
        return sum;
    }

    public double getTong() {
        return tong;
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

public class Cau3{
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


        Comparator<ThiSinh> cmp = new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh t1, ThiSinh t2) {
                if(t1.getSum() != t2.getSum()){
                    return Double.compare(t1.getSum(), t2.getSum());
                }else{
                   // return Double.compare(t2.getTong() - t1.getTong());
                   return 0;
                }
            }
        };
        Arrays.sort(ds, cmp);
        for(int i = 0; i < n; i++){
            System.out.println(ds[i]);
        }
    }
}

/*
2
KV1A002
To An An
kinh
9
7
9
0
KV1A004
Lo Van Lo
kinh
9
9
9
3
*/
