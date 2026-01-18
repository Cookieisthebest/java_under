package learnjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Bai1 {

    private static Scanner sc = new Scanner(System.in);
    private static int[] d = new int[100];

    public static void main(String[] args) {
        //Cách gọi này không tối ưu:
//        int[] a = new int[100], b = new int[100];
//        int n = sc.nextInt(), m = sc.nextInt();
        //Cách gọi tối ưu
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n], b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            d[a[i]] = 1;
        }
        List<Integer> k = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            if (d[b[i]] == 1) {
                k.add(b[i]);
                d[b[i]] = 0;
            }
        }
        // sử dụng ctrl + space ở mỗi biến trong sort 
        //--> nó sẽ ra lựa chọn thì đỡ phải đánh từng dòng
        Collections.sort(k, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ? 1:-1;
            }

        });
        for(int i : k){
            System.out.print(i + " ");
        }

    }

}
