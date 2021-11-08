package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            if (x1 >= 0 && x1 < 8) {
                if (x2 >= 0 && x2 < 8) {
                    if (y1 >= 0 && y1 < 8) {
                        if (y2 >= 0 && y2 < 8) {
                            return Math.abs(x1 - x2);
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        ChessBoard.way(2, 0, 5, 3);
    }
}