package ru.job4j.array;

public class FindLoop {
    public  static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index : data) {
            if (data[index] == el) {
                rst = index;
                break;
            }

        }
        return rst;
    }
}
