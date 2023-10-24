/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package view;
//import controller.QuanLy2;
package test21_KiemTra_XeOto;

import java.util.Scanner;
/**
 *
 * @author DucGiang
 */
public class Main2 {
    // Bai 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLy2 ql = new QuanLy2();
        ql.nhapOto(sc);
        ql.nhapXeTai(sc);
        ql.out();
        sc.close();
    }
}

