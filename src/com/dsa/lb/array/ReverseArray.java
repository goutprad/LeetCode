package com.dsa.lb.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80};
        int len = arr.length;
        for (int i = 0;i < len/2;i++){
           swap(arr, i, len-(i+1));
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int [] arr, int a, int b ){
        int ele = arr[a];
        arr[a] = arr[b];
        arr[b] = ele;
    }
}
