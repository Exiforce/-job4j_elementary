package ru.job4j.condition;

public class Point {
    public static double distance1(int x1, int x2) {
        return x2 - x1;
    }
    public static double distance2(int y1, int y2) {
        return y2 - y1;
    }
        public static void main(String[] args) {
        double result1 = Point.distance1(0, 0);
        double result2 = Point.distance2(2, 0);
        double n1 = Math.pow(result1, 2);
        double n2 = Math.pow(result2, 2);
        double n3 = n1 + n2;
        double total =  Math.sqrt(n3);
        System.out.println("result (0, 0) to (2, 0) " + total);
    }
}