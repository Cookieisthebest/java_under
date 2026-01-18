package learnjava;

import java.util.Arrays;
import java.util.Scanner;

public class LearnJava {
    private static Scanner sc = new Scanner(System.in);
    private static long gcd(long a,long b) {
        int n;
        //GCD(a, b) = GCD(b, a % b) = GCD(n,0) --> ucln của a và b là n
        while(b !=0){
            long x = a % b;
            a = b;
            b = x;
        }
        return a;
    }
    private static long lcm(long a, long b) {
        return (a /gcd(a,b)) * b;  //tối ưu
    }
    
    private static void check() {
        int n = sc.nextInt();
        long r = 2 ;
        for(int i = 3 ; i <= n;i++){   
//cách này không tối ưu --> cần phân tích thừa số nguyên tố thì sẽ ổn hơn
            r = lcm(r,i);
        }
        System.out.println(r);
    }
    
    public static void main(String[] args) {
        int t =sc.nextInt();
        while(t-->0){
             check();
        }
    }
    

 
}
