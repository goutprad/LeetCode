package com.dsa.lb.recursion;

public class PrintDecrIncrFun {
    public static void main(String[] args) {
        printDecrIncrFun(5);
    }

    public static void printDecrIncrFun(int n) {
        if (n > 0) {
            System.out.print(n);
            printDecrIncrFun(n - 1);
            System.out.print(n);
        }
    }
}
