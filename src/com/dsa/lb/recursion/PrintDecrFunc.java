package com.dsa.lb.recursion;

public class PrintDecrFunc {
    public static void main(String[] args) {
        printDecrFunc(5);
    }

    public static void printDecrFunc(int n) {
        if (n > 0) {
            System.out.print(n);
            printDecrFunc(n - 1);
        }
    }
}
