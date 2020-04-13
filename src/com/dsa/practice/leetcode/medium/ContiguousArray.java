package com.dsa.practice.leetcode.medium;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/contiguous-array/
 * 
 * @author Goutam
 *
 */
public class ContiguousArray {
	/**
	 * Time - O(N)
	 * @param nums
	 * @return
	 */
	public int findMaxLength(int[] nums) {
		HashMap<Integer, Integer> countsMap = new HashMap<Integer, Integer>();
		countsMap.put(0,-1);
		int maxLength = 0;
		int count=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0) {
				count += -1;
			} else {
				count += 1;
			}
			if(countsMap.containsKey(count)) {
				maxLength = Math.max(maxLength, i-countsMap.get(count));
			} else {
				countsMap.put(count, i);
			}
		}
		return maxLength;
	}
	
	/**
	 * Time - O(n2)
	 * @param nums
	 * @return
	 */
	public int findMaxLength_bruteForce(int[] nums) {
        int maxlen = 0;
        for (int start = 0; start < nums.length; start++) {
            int zeroes = 0, ones = 0;
            for (int end = start; end < nums.length; end++) {
                if (nums[end] == 0) {
                    zeroes++;
                } else {
                    ones++;
                }
                if (zeroes == ones) {
                    maxlen = Math.max(maxlen, end - start + 1);
                }
            }
        }
        return maxlen;
    }

	public static void main(String[] args) {
		ContiguousArray leetcode = new ContiguousArray();
		int[] nums = {0,1,1};
		System.out.println(leetcode.findMaxLength(nums));
	}

}
