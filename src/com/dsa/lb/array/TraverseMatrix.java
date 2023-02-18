package com.dsa.lb.array;

public class TraverseMatrix {
    public static void main(String[] args) {
        char mat[][] = {{'a', 'b', 'c', 'd'}, {'e', 'f', 'g', 'h'}, {'i', 'j', 'k', 'l'}};
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }

        for (int col = 0; col < mat[0].length; col++) {
            for (int row = 0; row < mat.length; row++) {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }
    }
}
