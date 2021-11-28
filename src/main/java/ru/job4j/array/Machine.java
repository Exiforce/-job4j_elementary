package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int temp = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (temp - coins[i] > 0) {
                temp -= coins[i];
                size++;
                rsl[size] = coins[i];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}