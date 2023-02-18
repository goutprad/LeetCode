package com.dsa.lb.recursion;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(productOfArray(arr, 0));
    }

    public static int productOfArray(int[] arr, int i) {
        if (i == arr.length) {
            return 1;
        }
        return arr[i] * productOfArray(arr, i + 1);
    }
}
