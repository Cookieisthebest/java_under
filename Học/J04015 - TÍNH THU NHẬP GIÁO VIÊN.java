package bai1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// cách 1 : 
class giaovien{
    private String ma, ten;
    private int lcb;

    public giaovien(String ma, String ten, int lcb) {
        this.ma = ma;
        this.ten = ten;
        this.lcb = lcb;
    }

    public String getMa() {
        return ma;
    }
    public int heso(){
        return Integer.parseInt(getMa().substring(2));
    }
    
    public int phucap(){
        String p = getMa().substring(0,2);
        if( p.equals("HT")) return 2000000;
        else if(p.equals("HP")) return 900000;
        else return 500000;
    }

    public String getTen() {
        return ten;
    }

    public int getLcb() {
        return lcb;
    }

    @Override
    public String toString() {
        return ma + " "+ ten +" "+ heso() + " "+ phucap() + " " +(lcb*heso() + phucap()) ;
        // return string +int + int + int kìa =))
       //Khi bạn thực hiện phép cộng giữa một String và một kiểu dữ liệu khác (như int, double, boolean),
       //Java sẽ tự động thực hiện một quá trình gọi là String Conversion (Chuyển đổi chuỗi). 
    }
    
}

public class LearnJava {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        giaovien a = new giaovien(sc.nextLine(),sc.nextLine(),sc.nextInt());
        System.out.println(a);
    }
   
}

/*
// Cách 2 : hay hơn cách 1
Public Teacher(String code, String name, int baseSalary) {
        this.code = code;
        this.name = name;
        this.baseSalary = baseSalary;

        coeSalary = Integer.parseInt(code.substring(2));

        if (code.substring(0, 2).equals("HT")) {
            allowance = 2000000;
        } else if (code.substring(0, 2).equals("HP")) {
            allowance = 900000;
        } else if (code.substring(0, 2).equals("GV")) {
            allowance = 500000;
        }
    }

    public int getSalary() {
        return baseSalary * coeSalary + allowance;
    }

    @Override
    public String toString() {
        return code + " " + name + " " + coeSalary + " " + allowance + " " + getSalary();
    }
}
*/

/*

class giaovien{
    private String ma,ten;
    private int lcb;
    private int phucap;
    private int heso ; 

    public giaovien(String ma, String ten, int lcb) {
        this.ma = ma;
        this.ten = ten;
        this.lcb = lcb;
        
        this.heso = Integer.parseInt(ma.substring(2));
        String a = ma.substring(0,2);
        if(a.equals("HT")) phucap = 2000000;
        else if(a.equals("HP")) phucap=900000;
        else phucap=500000;
        
    }

    @Override
    public String toString() {
        return this.ma + " "+ this.ten + " "+ this.heso + " "+ phucap + " " + (lcb*heso + phucap);
    }
     
}

public class LearnJava {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        giaovien a = new giaovien(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
        System.out.println(a);
    }
   
}


*/