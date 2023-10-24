/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package test23_KiemTra_QuanLySach;
//import controller.QuanLysach;
import java.util.Scanner;

/**
 *
 * @author DAO NGOC ANH
 */
public class cau2 {
    public static void main(String[] args) {
        QuanLysach q=new QuanLysach();
        Scanner in=new Scanner(System.in);
        q.nhapSachThamKhoa(in);
        q.nhapSachGiaoKhoa(in);
      //  q.out();
    }
}
