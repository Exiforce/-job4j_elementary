package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean rsl = true;
        for (int i = 0; i < right.length; i++) {
            if (right[right.length - 1] == left[left.length - 1]) {
                rsl = true;
            } else {
                rsl = false;
            }
        }
        return rsl;
    }
}
