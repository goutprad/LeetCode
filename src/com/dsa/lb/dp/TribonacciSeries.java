package com.dsa.lb.dp;

import java.util.Arrays;

public class TribonacciSeries {
    public static void main(String[] args) {
        int n = 4;
        int[] dp = new int[n+1];
        int[] dp1 = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(tribonacci_rec(n));
        System.out.println(tribonacci_memo(n, dp));
        System.out.println(tribonacci_tabulation(n, dp1));
    }
    public static int tribonacci_rec(int n) {
        if(n <= 2){
            return n == 2 ? 1 : n;
        }
        return tribonacci_rec(n-1)+tribonacci_rec(n-2)+tribonacci_rec(n-3);
    }

    public static int tribonacci_memo(int n, int[] dp) {
        if(n <= 2){
            return n == 2 ? 1 : n;
        }
        if(dp[n] != -1)
            return dp[n];
        return tribonacci_memo(n-1, dp)+tribonacci_memo(n-2, dp)+tribonacci_memo(n-3, dp);
    }

    public static int tribonacci_tabulation(int n, int[] dp) {
       for (int i=0; i<= n;i++){
           if(i<=2){
               dp[i] = i == 2 ? 1 :i;
               continue;
           }
           dp[i] = dp[i-1] +dp[i-2] +dp[i-3];
       }
       return dp[n];
    }
}
