package com.dsa.practice.leetcode.easy;

import java.util.Arrays;

public class NonDecreasingArray {
	public boolean checkPossibility(int[] nums) {
		int count =0;
		int[] arr = Arrays.copyOf(nums, nums.length);
		for (int i = 0; i < nums.length-1; i++) {
			if(arr[i]>nums[i+1]) {
				arr[i+1] = (nums[i]+nums[i+1])/2;
				count++;
			}
		}
		
		return count == 1;
	}

	public static void main(String[] args) {
		NonDecreasingArray leetcode = new NonDecreasingArray();
		int[] nums = { 3, 4, 2, 3 };
		boolean res = leetcode.checkPossibility(nums);
		System.out.println(res);
	}

}
