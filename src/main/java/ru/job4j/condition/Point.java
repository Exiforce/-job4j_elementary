package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int x2, int y1, int y2) {
        double n1 = x2 - x1;
        double n2 = y2 - y1;
        double n3 = Math.pow(n1, 2);
        double n4 = Math.pow(n2, 2);
        return n3 + n4;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double total = Math.sqrt(result);
        System.out.println("result (0, 0) to (2, 0) " + total);
    }
}