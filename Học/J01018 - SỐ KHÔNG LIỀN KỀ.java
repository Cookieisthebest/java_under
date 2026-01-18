
package learnjava;

import java.util.Scanner;


public class Bai1 {
     private static Scanner sc = new Scanner(System.in);
    
    private static boolean tong(int n) {
        int i =0;
        while(n>0)
        {
            i += n%10;
            n /=10;
        }
        if (i%10 ==0) return true;
        else return false;
    }
    
    private static boolean check(int n) {
        int i = n%10; // 
        while(n>0)
        {
            n /=10;
            if(Math.abs(i- (n%10))!=2) return false;
            else{
                i = n%10;
                
            }
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        
        int t =sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(tong(n)&&check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
        
    }
}

