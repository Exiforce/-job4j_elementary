package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean notEven(int num) {
        return !(num % 2 == 0);
    }

    public static boolean notPositive(int num) {
        return !(num >= 0);
    }

    public static boolean notEvenAndPositive(int num) {
        return !(num % 2 == 0) && num >= 0;
    }

    public static boolean evenOrNotPositive(int num) {
        return num % 2 == 0 || !(num >= 0);
    }

    public static void main(String[] args) {
        LogicNot.isEven(5);
        LogicNot.isPositive(5);
        LogicNot.notEven(5);
        LogicNot.notPositive(5);
        LogicNot.notEvenAndPositive(5);
        LogicNot.evenOrNotPositive(5);
    }
}