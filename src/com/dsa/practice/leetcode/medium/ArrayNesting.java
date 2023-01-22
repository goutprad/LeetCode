package com.dsa.practice.leetcode.medium;

public class ArrayNesting {
    public static void main(String[] args) {
        int[] nums = {5,4,0,3,1,6,2};
        System.out.println(arrayNesting(nums));
    }

    public static int arrayNesting(int[] nums) {

        int count=0;
        int index=0;
        for (int i=0;i<nums.length;i++){
            int start = nums[i];
            if(count == nums[i]){
                return 0;
            } else if(start != nums[index]){
                count++;
            }
        }
        return count;
    }
}
