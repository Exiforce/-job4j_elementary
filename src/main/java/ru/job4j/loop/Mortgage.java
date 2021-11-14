package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double money = amount + (amount * percent) - salary;
        while (money <= 0) {
            money = amount + (amount * percent) - salary;
            year += 1;
        }
        return year;
    }
}
