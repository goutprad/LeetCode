package com.dsa.lb.recursion;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sumOfArray(arr, 0));
    }

    public static int sumOfArray(int[] arr, int i) {
        if (i == arr.length) {
            return 0;
        }
        return arr[i] + sumOfArray(arr, i + 1);
    }
}
