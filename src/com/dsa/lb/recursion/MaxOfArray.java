package com.dsa.lb.recursion;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3,4,5};
        System.out.println(maxOfArray(arr, 0));
    }
    public static int maxOfArray(int[] arr, int i){
        if(i == arr.length){
            return arr[arr.length-1];
        }
        return Math.max(arr[i], maxOfArray(arr, i+1));

    }
}
