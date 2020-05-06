package com.dsa.practice.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 169. Majority Element
 * https://leetcode.com/problems/majority-element/
 * 
 * @author Goutam
 *
 */
public class MajorityElement {
	/**
	 * Time - O(N)
	 * space -o(n)
	 * 
	 * @param nums
	 * @return
	 */
	public int majorityElement(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			} else {
				map.put(nums[i], 1);
			}
		}
		
		Entry<Integer, Integer> majorityEntry = null;
		for (Entry<Integer, Integer> i : map.entrySet()) {
			if(majorityEntry == null || majorityEntry.getValue() < i.getValue()) {
				majorityEntry = i;
			}
		}
		return majorityEntry.getKey();
	}
	
	/**
	 * Time - O(nlogn)
	 * @param nums
	 * @return
	 */
	public int majorityElement_sort(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length/2];
	}
	
	/**
	 * Boyer-Moore Voting Algorithm
	 * Time - O(n)
	 * 
	 * @param nums
	 * @return
	 */
	public int majorityElement_3(int[] nums) {
		int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
	}
	public static void main(String[] args) {
		MajorityElement leet = new MajorityElement();
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(leet.majorityElement(nums));
		System.out.println(leet.majorityElement_sort(nums));
		System.out.println(leet.majorityElement_3(nums));
	}

}
