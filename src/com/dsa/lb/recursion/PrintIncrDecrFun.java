package com.dsa.lb.recursion;

public class PrintIncrDecrFun {
    public static void main(String[] args) {
        printIncrDecrFun(5);
    }

    public static void printIncrDecrFun(int n) {
        if (n == 0) {
            return;
        }
        printIncrDecrFun(n-1);
        System.out.print(n);
        printIncrDecrFun(n-1);
    }
}
