package com.dsa.lb.array;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {
    public static void main(String[] args) {

        List<List<Integer>> temp = new ArrayList<>();
        for (int i =0 ; i< temp.size(); i++){
            System.out.println(temp.get(i));
            for (int j= 0; j < temp.get(i).size(); i++) {
                System.out.println(temp.get(i).get(j));
            }
        }
        int nums[] = {1, 2, 3, 4,5};
        int k = 4;
        int len = nums.length;
        //if(k>0) k%=len+1; //l<k
        k%=len;
        reverse(nums, 0, len-k-1);
        reverse(nums, k, len-1);
        reverse(nums, 0, len-1);


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

    public static void reverse(List<Integer> arr, int start, int end) {
        while (start < end){
            int ele = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, ele);
            start++;
            end--;
        }
    }
}
