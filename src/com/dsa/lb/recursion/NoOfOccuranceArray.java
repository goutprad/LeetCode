package com.dsa.lb.recursion;

public class NoOfOccuranceArray {
    public static void main(String[] args) {
        int[] arr = {2,5,6,3,5,5,2,5};
        System.out.println(countOccurance(arr, 0, 5));
    }
    public static int countOccurance(int[] arr, int i, int target){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return 1;
        }
       int count = countOccurance(arr, i+1, target);
        return count;
    }
}
