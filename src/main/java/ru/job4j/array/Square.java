package ru.job4j.array;

public class Square {
    public static int[] caiculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = i * i;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = caiculate(4);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
