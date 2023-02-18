package com.dsa.lb.recursion;

public class FirstOccuranceOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 4, 5, 6};
        System.out.println(firstOccurance(arr, 0, 7));
    }

    public static int firstOccurance(int[] arr, int i, int target) {
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        } else {
            return firstOccurance(arr, i+1, target);
        }
    }
}
