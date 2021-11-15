package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            int credit = salary - (int) (amount * percent / 100);
            amount -= credit;
            year++;
        }
        return year;
    }
}
