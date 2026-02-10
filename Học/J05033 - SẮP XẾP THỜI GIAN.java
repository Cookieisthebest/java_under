package bai1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// Cách 2 : Dùng comparator , bắt buộc phải có getter ở đây để lấy h,m,s mà so sánh
class time{
    private int h,m,s;

    public time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }

    @Override
    public String toString() {
        return h + " " + m + " " + s;
    }
    
}
public class LearnJava {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        List<time> a = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
           time k = new time(sc.nextInt(),sc.nextInt(),sc.nextInt());
           a.add(k);
        }
        Collections.sort(a, new Comparator<time>(){
            @Override
            public int compare(time o1, time o2) {
                if(o1.getH() != o2.getH()) return o1.getH() > o2.getH() ? 1 : -1;
                else if(o1.getM() != o2.getM()) return o1.getM() > o2.getM() ? 1 : -1;
                else return o1.getS() > o2.getS() ? 1 : -1;
            } 
        });
        
        for(int i = 0 ; i < n ; i++){
            System.out.println(a.get(i));
        }
    }
}



/*
// Cách 1 : Comparable
class time implements Comparable<time>{
    private int h,m,s;

    public time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    @Override
    public int compareTo(time o) {
       if(this.h != o.h) return this.h - o.h;
       else if(this.m != o.m) return this.m - o.m;
       return this.s - o.s;
    }

    @Override
    public String toString() {
        return h + " " + m + " " + s;
    }
    
}


public class LearnJava {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        List<time> a = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
           time k = new time(sc.nextInt(),sc.nextInt(),sc.nextInt());
           a.add(k);
        }
        Collections.sort(a);
        for(int i = 0 ; i < n ; i++){
            System.out.println(a.get(i));
        }
    }
}
*/