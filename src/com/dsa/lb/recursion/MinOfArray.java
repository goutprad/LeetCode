package com.dsa.lb.recursion;

public class MinOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3,4,5};
        System.out.println(minOfArray(arr, 0));
    }
    public static int minOfArray(int[] arr, int i){
        if(i == arr.length){
            return arr[arr.length-1];
        }
       return Math.min(arr[i], minOfArray(arr, i+1));
    }
}
