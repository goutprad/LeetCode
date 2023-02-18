package com.dsa.lb.recursion;

public class RecursionTree {
    public static void main(String[] args) {
        fun(3);
    }
    public static void fun(int n){
        if(n == 0){
            System.out.println("Hitting Base case.");
            return;
        }
        System.out.println("Pre "+n);
        fun(n-1);
        System.out.println("In "+n);
        fun(n-1);
        System.out.println("Post "+n);
    }
}
