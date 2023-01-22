package com.dsa.lb.array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40,50};
        int k = 5;
        int len = nums.length-1;
        if(k>0) k%=len+1; //l<k
        reverse(nums, 0, len);
        reverse(nums, k, len);
        reverse(nums, 0, k-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void reverse(int[] nums, int start, int end){
        while(start<end){
            int ele = nums[start];
            nums[start] = nums[end];
            nums[end] = ele;
            start++;
            end--;
        }
    }
}
