
import java.util.Scanner;

public class Try1{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        for(int k = 1 ; k <= t; k++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n+1][m+1];
            int[][] b = new int[n+1][m+1];
            int[][] c = new int[n][n];   //thử đề thành [100][100] 
            //output khi dùng int[][] c = new int[100][100];
    //5 11 0 0 .... 98 số 0
    //25 5 0 0......98 số 0
            //mà trong C thường nó sẽ ko bị như thế này khi in ra 
            for(int i = 0 ; i < n ;i++)
            {
                for(int j = 0 ; j < m; j++)
                {
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    c[i][j] = 0;
                }
            }
            for(int i = 0 ; i < n ;i++)
            { 
                for(int j = 0 ; j < n; j++)
                {
                    for(int p = 0;  p <  m; p++)
                    {
                        c[i][j] += a[i][p] * b[p][j];
                    }
                }
            }
            
            System.out.println("Test "+k+":");
            for(int i = 0 ; i < c.length ;i++)  //// cách in ra mảng 2 chiều - hay dùng trong khi xây dựng các lớp interface
            { 
                for(int j = 0 ; j < c[0].length; j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }
        }
    }
}
