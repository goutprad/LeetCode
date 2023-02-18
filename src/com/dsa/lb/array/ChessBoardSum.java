package com.dsa.lb.array;

public class ChessBoardSum {
    public static void main(String[] args) {
        int[][] chess = {{1, 2, 3, 4, 5, 6, 7, 8},//13,20
                {1, 2, 3, 4, 5, 6, 7, 8},
                {1, 2, 3, 4, 5, 6, 7, 8},
                {1, 2, 3, 4, 5, 6, 7, 8},
                {1, 2, 3, 4, 5, 6, 7, 8},
                {1, 2, 3, 4, 5, 6, 7, 8},
                {1, 2, 3, 4, 5, 6, 7, 8},
                {1, 2, 3, 4, 5, 6, 7, 8}};
        int blackSum = 0;
        int whiteSum = 0;
        for (int row = 0; row < chess.length; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < chess[row].length; col += 2) {
                    blackSum += chess[row][col];
                }
            } else {
                for (int col = 1; col < chess[row].length; col += 2) {
                    whiteSum += chess[row][col];
                }
            }
        }
        System.out.println(whiteSum + " " + blackSum);
        blackSum = 0;
        whiteSum = 0;
        for (int row = 0; row < chess.length; row++) {
            for (int col = 0; col < chess[row].length; col++) {
                if (row + col % 2 == 0) {
                    blackSum += chess[row][col];
                } else {
                    whiteSum += chess[row][col];
                }
            }
        }
        System.out.println(whiteSum + " " + blackSum);
    }
}
