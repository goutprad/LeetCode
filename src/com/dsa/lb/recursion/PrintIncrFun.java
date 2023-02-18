package com.dsa.lb.recursion;

public class PrintIncrFun {
    public static void main(String[] args) {
        printIncrFun(5);
    }

    public static void printIncrFun(int n) {
        if (n > 0) {
            printIncrFun(n - 1);
            System.out.print(n);
        }
    }
}
