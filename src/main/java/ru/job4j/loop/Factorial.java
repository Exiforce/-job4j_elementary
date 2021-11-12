package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int x;
        int result = 1;
        for (x = 1; x <= n; x++) {
            result = result * x;
        }
    return result;
    }
}
