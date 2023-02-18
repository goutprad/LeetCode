package com.dsa.lb.dp;

import java.util.Arrays;

public class ClimbStairs {
    public static void main(String[] args) {
        int n = 4;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(climbStairs(n));
        System.out.println(climbStairs_dp(n, dp));
        int[] dp1 = new int[n + 1];
        System.out.println(climbStairs_tabulation(n, dp1));
    }

    public static int climbStairs(int n) {
        if (n <= 2)
            return n;

        return climbStairs(n - 1) + climbStairs(n - 2);
    }


    public static int climbStairs_dp(int n, int[] dp) {
        if (n <= 2)
            return n;
        if (dp[n] != -1)
            return dp[n];
        return climbStairs_dp(n - 1, dp) + climbStairs_dp(n - 2, dp);
    }

    public static int climbStairs_tabulation(int n, int[] dp) {
        for (int i=0; i<=n;i++){
            if(i <= 2){
                dp[i] =i;
                continue;
            }
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
