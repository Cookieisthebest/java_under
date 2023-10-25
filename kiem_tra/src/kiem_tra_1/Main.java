package kiem_tra_cuc;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void menu(){
        System.out.println("1.Nhap vao day so thuc");
        System.out.println("2.Viet ra phan tu nho nhat cua day so");
        System.out.println("3.Sap xep va dua ra day so giam dan");
        System.out.println("4.Sap xep va dua ra day so giam dan");
        System.out.println("5.Dua ra so cau");
        System.out.println("6.Chuan hoa va viet ra");
        System.out.println("7.Nhap vao 1 da thuc ");
        System.out.println("8.Tinh tong 2 da thuc");
        System.out.println("9.Tinh Pn(x)/Qm(x) va da thuc du");
    }
    
    public static void main(String[] args) {
        int choice = 1;
        dayso a = new dayso();
        vanban b = new vanban();
        dathuc m1 = null;
        dathuc m2 = null;
        dathuc tong = null;
        while(choice != 0)
        {
            menu();
            choice = sc.nextInt();
            switch(choice)
            {
                case 1: 
                    sc.nextLine();
                    String tmp = sc.nextLine();
                    while(tmp.equals(""))
                    {
                        tmp = sc.nextLine();
                    }
                    ArrayList<Integer> arr = new ArrayList<>();
                    for(String x : tmp.split("\\s+"))
                    {
                        arr.add(Integer.parseInt(x));
                    }
                    a = new dayso(arr);
                    break;
                case 2:
                    a.nhonhat();
                    break;
                case 3:
                    a.sapxep();
                    break;
                case 4:
                    sc.nextLine();
                    String ans = sc.nextLine();
                    b = new vanban(ans);
                    break;
                case 5:
                    b.soCau();
                    break;
                case 6:
                    b.chuanHoa();
                    break;
                case 7:
                    int n = sc.nextInt();
                    m1 = new dathuc(n);
                    m2.input();
                    break;
                case 8:
                    int n2 = sc.nextInt();
                    m2 = new dathuc();
                    m2.input();
                    tong = m1.tonghaidathuc(m2);
                    int[] ham1 = tong.mangdathuc();
                    for(int i = 0; i < ham1.length ; i++)
                    {
                        System.out.println(ham1[i] +" ");
                    }
                    break;
                default:
                    choice = sc.nextInt();
                    
            }
        }

    }
}