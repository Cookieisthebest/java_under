package learnjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/*
TH đúng : 1 số phải toàn số cắt đôi được và nó khác 0
TH sai :  
- 1 số có chứa 1 phần tử không hợp lệ  --> switch case
- 1 số cắt đôi toàn ra số không hợp lệ --> switch case
- 1 số chỉ toàn ra 0  --> > 0
*/

public class Bai1 {

     private static Scanner sc = new Scanner(System.in);
    public static int check(String n) {
    //    String k = String.valueOf(n);
        String an = "";
        for(int i = 0; i < n.length();i++){
            switch(n.charAt(i)){
                case '0':case '8':case '9':
                    an +='0';
                    break;
                case '1':
                    an += '1';
                    break;
                default: 
                    return 0;
            }
        }
        return Integer.parseInt(an);   
    }
    
    public static void main(String[] args) {
        
        int t =sc.nextInt();
        while(t-->0){
            String n = sc.next();
            if(check(n)>0) System.out.println(check(n));
            else System.out.println("INVALID");
        }
        
    }
}

/*
//Cách 2 : Dùng để ôn thôi : StringBuilder + try catch
// Stringbuilder(hơi ko tối ưu) 
// Trycatch(hơi ko ổn) vì có thể return "0" được thay vì "INVALID"
  private static Scanner sc = new Scanner(System.in);

    public static String check(String n) {
        StringBuilder an = new StringBuilder();
        for (int i = 0; i < n.length(); i++) {
            switch (n.charAt(i)) {
                case '0':
                case '8':
                case '9':
                    an.append('0');
                    break;
                case '1':
                    an.append('1');
                    break;
                default:
                    return "INVALID";
            }
        }
        return an.toString(); //String.valueOf(an)   
    }

    public static void main(String[] args) {

        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next();
            String s = check(n);
            try {
                if (Long.parseLong(s) == 0) {
                    System.out.println("INVALID");
                } else {
                    System.out.println(Long.parseLong(s));
                }
                // NumberFormatException 
            } catch (NumberFormatException e) {
                System.out.println("INVALID");
            }
        }

    }

*/