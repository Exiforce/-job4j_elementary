package ru.job4j.condition;

public class SqArea {

    public static double square(double p, double k) {
        double n1 = p / 2;
        double n2 = k + 1;
        double h = n1 / n2;
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double sq = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + sq);
    }
}
