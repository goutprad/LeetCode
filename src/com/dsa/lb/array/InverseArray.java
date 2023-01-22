package com.dsa.lb.array;

import java.util.Arrays;

public class InverseArray {
    public static void main(String[] args) {
        int arr[] = {1,3, 2,0,4};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(inverse(arr)));
    }
    public static int[] inverse(int [] arr) {
        int[] newArr = new int[arr.length];
        for (int i=0; i<arr.length;i++){
            newArr[arr[i]] = i;
        }
        return newArr;
    }
}
