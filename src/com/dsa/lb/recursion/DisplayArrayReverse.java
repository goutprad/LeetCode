package com.dsa.lb.recursion;

public class DisplayArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        displayArrayReverse(arr, 0);
    }

    public static void displayArrayReverse(int[] arr, int i){
        if(i == arr.length){
            return;
        }
        displayArrayReverse(arr, i+1);
        System.out.print(arr[i]);
    }
}
