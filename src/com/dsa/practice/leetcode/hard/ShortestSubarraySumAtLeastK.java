package com.dsa.practice.leetcode.hard;

public class ShortestSubarraySumAtLeastK {
	public int shortestSubarray(int[] A, int K) {
		int length = A.length+1;
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum = A[i];
			if (sum >= K)
				return 1;
			for (int j = i+1; j < A.length; j++) {
				sum+=A[j];
				if(sum>=K&&(j-i+1)<length) {
					length=j-i+1;
				} 
			}
		}
		return length;
	}

	public static void main(String[] args) {
		int[] input = { 5, 3, 1, 7, 6, 4, 2, 4 }; //3
		int[] input1 = { 2, -1, 2 }; //3
		int[] input2 = { 1 }; //1
		int[] input3 = { 1, 2 }; //-1
		ShortestSubarraySumAtLeastK subArr = new ShortestSubarraySumAtLeastK();
		System.out.println("len--->"+subArr.shortestSubarray(input, 15));
		System.out.println("len--->" + subArr.shortestSubarray(input1, 3));
		System.out.println("len--->" + subArr.shortestSubarray(input2, 1));
		System.out.println("len--->" + subArr.shortestSubarray(input3, 4));
	}

}
