package bai1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Point {

    private double x, y, d;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distance(Point t) {
        return distance(t.x, t.y);
    }

    public void setD(double d) {
        this.d = d;
    }
    

    @Override
    public String toString() {
        return String.format("%.4f",d );
    }
    
}

public class LearnJava {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            Point t1 = new Point(sc.nextDouble(),sc.nextDouble());
            Point t2 = new Point(sc.nextDouble(),sc.nextDouble());
            double khoangCach = t1.distance(t2);
            t1.setD(khoangCach); // Gán kết quả vào biến d của đối tượng
            System.out.println(t1); // Lúc này Java sẽ tự gọi toString() và in ra 4 số cuối
            System.out.println(t1.distance(t2)); //Hàm distance trả về kiểu double
        }
    }

}

