package bai1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class student {

    private String name, idLop;
    private String ngaySinh;
    private double gpa;

    public student(String name, String idLop, String ngaySinh, double gpa) {
        this.name = name;
        this.idLop = idLop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdLop() {
        return idLop;
    }

    public void setIdLop(String idLop) {
        this.idLop = idLop;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String formatDob() {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date ngayVietLai = formatter.parse(ngaySinh);
            return formatter.format(ngayVietLai);
        } catch (ParseException e) {
            System.out.println(e);
        }
        return "";
    }

    @Override
    public String toString() {
        return "B20DCCN001 " + getName() + " " + getIdLop() + " " + formatDob() + " " + String.format("%.2f", getGpa());
    }

}

public class LearnJava {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        student c = new student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        System.out.println(c);
    }

}
