package ru.job4j.loop;

public class Counter {
    public static int sum(int first, int finish) {
        int total = 0;
        int sum;
        for (sum = first; sum <= finish; sum++) {
            total = total + sum;
        }
        return total;
    }

    public  static void main(String[] args)  {
        System.out.println("Сумма всех чисел в цикле = " + sum(0, 10));
        System.out.println("Сумма всех чисел в цикле = " + sum(3, 8));
        System.out.println("Сумма всех чисел в цикле = " + sum(1, 1));
    }
}
