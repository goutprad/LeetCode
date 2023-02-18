package com.dsa.lb.dp;

import java.util.Arrays;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n =4;
        System.out.println(fibonacci(n));
        int[] dp = new int[n+1];
        int[] dp1 = new int[n+1];
        Arrays.fill(dp, -1);
        Arrays.fill(dp1, -1);
        System.out.println(fibonacci_dp_memo(n, dp));

        System.out.println(fibonacci_dp_tabu(n, dp1));
        System.out.println(fibonacci_optimised(n));
    }

    public static int fibonacci(int n){
        if(n<=1)
            return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static int fibonacci_dp_memo(int n, int[] dp){
        if (n<=1)
            return n;
        if (dp[n] != -1)
            return dp[n];

        return fibonacci_dp_memo(n-1, dp) + fibonacci_dp_memo(n-2, dp);
    }

    public static int fibonacci_dp_tabu(int n, int[] dp){

        for (int i=0;i<=n;i++){
            if (i<=1){
                dp[i] = i;
                continue;
            }
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static int fibonacci_optimised(int n) {
        if(n == 0) return 0;
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i=2; i<= n;i++){
            c = a+b;
            a = b;
            b = c;
        }
        return b;
    }
}
