package ru.job4j.condition;

public class SqArea {
    public static double square1(double p) {
        return p / 2;
    }
    public static double square2(double k) {
        return k + 1;
    }
    public static void main(String[] args) {
        double result1 = SqArea.square1(6);
        double result2 = SqArea.square2(2);
        double n1 = result1 / result2;
        double n2 = result2 - 1;
        double total = n1 * n1 * n2;
        System.out.println(" p = 6, k = 2, s = 2, real = " + total);
    }
}
