
package learnjava;

import java.util.Scanner;


public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        /*
         double a = scanner.nextDouble(), b = scanner.nextDouble();
         float a = sc.nextFloat() , float b = sc.nextFloat();
        */
        if(a==0){
            if(b==0) System.out.println("VN");
            else System.out.println("VSN");
        }else System.out.printf("%.2f\n",-b/(double)a);
        // System.out.println(String.format("%.2f", -b / a));
    }
}

