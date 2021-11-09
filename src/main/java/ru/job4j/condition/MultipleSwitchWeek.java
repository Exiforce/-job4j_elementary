package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int namberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресение", "Sunday" -> 7;
            default -> -1;
        };
    }

    public static  void main(String[] args) {
        int rsl = MultipleSwitchWeek.namberOfDay("Понедельник");
        System.out.println(rsl);
    }
}
