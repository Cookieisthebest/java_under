package learnjava;

import java.util.Arrays;
import java.util.Scanner;

public class LearnJava {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] s = sc.nextLine().trim().toLowerCase().split("\\s+");
            StringBuilder k = new StringBuilder();
            for(String i:s){
                k.append(Character.toUpperCase(i.charAt(0))).append(i.substring(1)).append(" ");
            }
            System.out.println(k.toString().trim());
        }
    }
}
/*
Cách 1:
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine().trim().toLowerCase(); //nGuYEN   vAN    naM   \n --> nguyen van nam
            String[] k = s.split("\\s+"); //[nGuYEN,vAN,naM]  
            for (int i = 0; i < k.length; i++) {
                k[i] = Character.toUpperCase(k[i].charAt(0)) + k[i].substring(1) + " ";
            }

            System.out.println(String.join(" ", k)); // nó tự xuống dòng và ko bị thừa " " ở cuối tên
        }
*/
/*
Bài  J03005	 CHUẨN HÓA XÂU HỌ TÊN 2 (luyện substring)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] s = sc.nextLine().trim().toLowerCase().split("\\s+");
            for (int i = 1; i < s.length; i++) {
                s[i] = s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
                if (i != s.length - 1) {
                    System.out.print(s[i] + " ");
                } else {
                    System.out.print(s[i]);
                }
            }
            System.out.print(", " + s[0].toUpperCase() + "\n");
        }

    }

*/

/* 	Lưu ý về việc dùng for each
StringBuilder b = new StringBuilder(); 
for (String i : s) { // i lấy từng từ ra (ví dụ: "nam")
    String wordCap = i.substring(0, 1).toUpperCase() + i.substring(1); // Tạo ra "Nam"
    b.append(wordCap).append(" "); // Bỏ "Nam" vào cái giỏ 'b'
}

// Ở đây, for-each hoàn thành xuất sắc nhiệm vụ: Lấy dữ liệu từ mảng ra để xử lý. 
//  	Bạn không cần quan tâm đến việc mảng s có thay đổi hay không, 
//  	vì mục tiêu cuối cùng của bạn là xây dựng nội dung cho đối tượng b.

*/