package bai1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Rectange{
    private double width,height;
    private static String color;

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        Rectange.color = color;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static String getColor() {
//        String c = color.trim();
//        return c.substring(0,1).toUpperCase() + c.substring(1).toLowerCase();
return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }

    public static void setColor(String color) {
        Rectange.color = color;
    }
    
    public double findArea() {
        return width * height; // Diện tích = Dài * Rộng
    }

    public double findPerimeter() {
        return (width + height) * 2; // Chu vi = (Dài + Rộng) * 2
    }

    @Override
    public String toString() {
        return String.format("%.0f %.0f %s",findPerimeter(), findArea(), getColor());
    }
    
}

public class LearnJava {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Rectange c = new Rectange(sc.nextDouble(),sc.nextDouble(), sc.next());
        System.out.println(c);
    }

}

