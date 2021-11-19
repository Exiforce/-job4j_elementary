package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i1 = 0; i1 < word.length; i1++) {
            for (int i2 = 0; i2 < pref.length; i2++) {
                if (word[i1] != pref[i2]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
