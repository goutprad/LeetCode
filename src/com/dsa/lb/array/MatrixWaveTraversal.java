package com.dsa.lb.array;

public class MatrixWaveTraversal {
    public static void main(String[] args) {
        char mat[][] = {{'a', 'b', 'c', 'd'}, {'e', 'f', 'g', 'h'}, {'i', 'j', 'k', 'l'}};
        boolean tob = true;
        for (int row = 0; row < mat.length; row++) {
            if (tob) {
                for (int col = 0; col < mat[0].length; col++) {
                    System.out.print(mat[row][col] + " ");
                }
            } else {
                for (int col = mat[0].length-1; col >= 0; col--) {
                    System.out.print(mat[row][col] + " ");
                }
            }
            tob = !tob;
            System.out.println();
        }

        for (int col = 0; col < mat[0].length; col++) {
            if (tob) {
                for (int row = 0; row < mat.length; row++) {
                    System.out.print(mat[row][col] + " ");
                }
            } else {
                for (int row = mat.length-1; row >= 0; row--) {
                    System.out.print(mat[row][col] + " ");
                }
            }
            tob = !tob;
            System.out.println();
        }
    }
}
