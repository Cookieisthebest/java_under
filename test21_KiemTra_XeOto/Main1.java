/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package view;
//
//import model.Oto;
//import model.XeTai;
package test21_KiemTra_XeOto;

/**
 *
 * @author DucGiang
 */
public class Main1 {

    // Bai 1
    public static void main(String[] args) {
        Oto o = new Oto("Yaris", "02/2023", 32000, 4, 1.5);
        o.setMa();
        System.out.println(o);
        Oto o1 = new Oto("Yaris", "09/2020", 30000, 4, 1.5);
        o1.setMa();
        System.out.println(o1);
        XeTai t = new XeTai("Ranger", "10/2018", 16000, 3.5, true);
        t.setMa();
        System.out.println(t);
    }
}
/* Ouput
YA-001 Yaris 02/2023 4 35200
YA-002 Yaris 09/2020 4 24000
T-003 Ranger 10/2018 3.5 14080
*/
