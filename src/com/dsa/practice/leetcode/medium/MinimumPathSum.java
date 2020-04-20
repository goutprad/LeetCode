package com.dsa.practice.leetcode.medium;

/**
 * 64. Minimum Path Sum
 * https://leetcode.com/problems/minimum-path-sum/
 * 
 * @author Goutam
 *
 */
public class MinimumPathSum {
	public int minPathSum(int[][] grid) {
		int[][] dp = new int[grid.length][grid[1].length];
		dp[0][0] = grid[0][0];
		for (int i = 1; i < grid.length; i++) {
			dp[i][0] = dp[i-1][0] + grid[i][0]; 
		}
		for (int i = 1; i < grid[0].length; i++) {
			dp[0][i] = dp[0][i-1] + grid[0][i];
		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				dp[i][j] = grid[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
			}
		}
		return dp[grid.length-1][grid[0].length-1];
	}

	public static void main(String[] args) {
		MinimumPathSum leetcode = new MinimumPathSum();
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		System.out.println(leetcode.minPathSum(grid)); //7
	}

}
