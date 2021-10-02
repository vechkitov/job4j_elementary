package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char[] arrRow = board[row];
        for (int i = 1; i < arrRow.length; i++) {
            if (arrRow[i] != arrRow[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
