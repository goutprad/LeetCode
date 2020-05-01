package com.dsa.practice.leetcode.medium;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 * 33. Search in Rotated Sorted Array
 * 
 * Example 1 : Input: nums = [4,5,6,7,0,1,2], target = 0 Output: 4
 * Example 2 : Input: nums = [4,5,6,7,0,1,2], target = 3 Output: -1
 * 
 * @author Goutam
 *
 */
public class SearchInRotatedSortedArray {
	public int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] >= nums[left]) {
				if (nums[left] <= target && target <= nums[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			} else {
				if (nums[mid] <= target && target <= nums[right]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		SearchInRotatedSortedArray leet = new SearchInRotatedSortedArray();
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println(leet.search(nums, 0));
	}

}
