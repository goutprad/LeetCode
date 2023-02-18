package com.dsa.lb.recursion;

public class SumOfNum {
    public static void main(String[] args) {
        System.out.println(sumOfNum(5));
    }
    public static int sumOfNum(int n) {
        if(n == 0){
            return 0;
        }
        return  n + sumOfNum(n-1);
    }
}
