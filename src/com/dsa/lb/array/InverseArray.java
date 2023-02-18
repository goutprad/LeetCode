package com.dsa.lb.array;

import java.util.Arrays;

public class InverseArray {
    public static void main(String[] args) {
        int arr[] = {3,0, 1,5,4,2};
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
