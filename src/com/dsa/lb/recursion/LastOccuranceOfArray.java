package com.dsa.lb.recursion;

public class LastOccuranceOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 5, 2, 2, 3};
        System.out.println(lastOccurance(arr, arr.length-1, 2));
    }

    public static int lastOccurance(int[] arr, int i, int target) {
        if (i < 0) {
            return -1;
        }
       if(arr[i] == target){
           return i;
       }
       return lastOccurance(arr, i-1, target);

    }
}
