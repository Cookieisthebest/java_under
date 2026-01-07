
package learnjava;

import java.util.Scanner;


public class Bai1 {
    public static void main(String[] args) {
        int[] f= new int[92];
        f[0] = 0;
        f[1] = 1;
       // f[2] = 1; // 0 1 1 2 3 5
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while( t > 0){
            int n = sc.nextInt();
            //int ans = 0;
            for(int i=2; i < n + 1;i++){
                f[i] = f[i-2] + f[i-1]; //f2= 1 , f3=2
            }
            System.out.println(f[n]);
            t--;
        }
    }
}

// =======================================================  
/* Cách làm ôn hàm
// Cách 1 : tự sinh ra trước các số luôn --> đỡ tốn O(n) và dùng luôn đáp án có sẵn từ vòng lặp for
// Cách này có sự tối ưu về code hơn.
// Ôn hàm void
public class Bai1 {

    public static Scanner ip = new Scanner(System.in);
    public static long[] fibo = new long[100];

    public static void prepare() {
        fibo[1] = fibo[2] = 1L; 
// nghĩa là long fibo[1] = 1 --> bản thân mk thấy ko cần cho vào định dạng như vậy khi đã khai báo ở trên
       
        for (int i = 3; i <= 92; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }

    public static void testCase() {
        int n = ip.nextInt();
        System.out.println(fibo[n]);
    }

    public static void main(String[] args) {
        prepare();
        int T = ip.nextInt();
        while (T-- > 0) {
            testCase();
        }
    }
}

// Cách 2: Ôn hàm trả về (return)
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            System.out.println(fibonacci(n));
        }
    }

    public static long fibonacci(int n){
        if(n == 1) return 1;
        if(n == 2) return 1;
        long f1 = 1, f2 = 1, fn = f1 + f2;
        for(int i = 3; i <= n; i++){
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }
}
*/