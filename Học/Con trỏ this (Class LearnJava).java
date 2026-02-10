package bai1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


// Phần 2 : Hiểu cách nó gọi lúc this và x
class Thu {
    double x; // Biến của Class (mặc định Java sẽ gán bằng 0.0)

    // Hàm lấy giá trị x nhưng không dùng this
    public double getX_Normal() {
        return x; // Java tự hiểu đây là x của Class vì không có ai trùng tên
    }

    // Hàm lấy giá trị x nhưng dùng this
    public double getX_WithThis() {
        return this.x; // Chỉ định rõ ràng lấy x của Class
    }
}

public class LearnJava {
    public static void main(String[] args) {
        Thu obj = new Thu();
        
        // Gán giá trị trực tiếp cho biến x của đối tượng
        obj.x = 99.9;

        System.out.println("Dùng getX_Normal: " + obj.getX_Normal());
        System.out.println("Dùng getX_WithThis: " + obj.getX_WithThis());
    }
}


/*
Phần 1 : HIểu về con trỏ this
class Thu {
    double x; // Đây là biến của Class (Instance Variable)
// (A) BIẾN CLASS: Nằm ngoài các hàm, thuộc về cả lớp.
    // Constructor để gán giá trị ban đầu cho x của Class
    public Thu(double x) {
        this.x = x; 
    }

    // Trường hợp 1: Trả về x cục bộ (không dùng this)
    public double getX_Local() {
        // --- Bắt đầu vùng cục bộ của hàm ---
        double x = 10.0; // (B) BIẾN CỤC BỘ: Chỉ tồn tại bên trong đôi ngoặc nhọn này.
        return x;        // Nó sẽ ưu tiên tìm (B) trước.
        // --- Kết thúc vùng cục bộ: Biến (B) sẽ bị xóa sổ khỏi bộ nhớ ---
    }

    // Trường hợp 2: Trả về x của Class (có dùng this)
    public double getX_This() {
        double x = 19.0; // Biến cục bộ trùng tên
        return this.x;   // Bắt buộc dùng this để "chỉ tận tay" vào biến Class ở trên
    }
}

public class LearnJava {
    public static void main(String[] args) {
        // Bước 1: Tạo đối tượng và gán x của Class là 50.5
        Thu obj = new Thu(50.5);

        // Bước 2: Gọi hàm không dùng this
        double result1 = obj.getX_Local();
        System.out.println("Gia tri lay tu getX_Local (khong this): " + result1);
        // Kết quả sẽ là 10.0 vì nó bị biến cục bộ lừa

        // Bước 3: Gọi hàm dùng this
        double result2 = obj.getX_This();
        System.out.println("Gia tri lay tu getX_This (co this): " + result2);
        // Kết quả sẽ là 50.5 vì this đã tìm đúng đến biến của Class
    }
}

*/
