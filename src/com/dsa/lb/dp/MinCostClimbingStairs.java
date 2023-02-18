package com.dsa.lb.dp;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(cost));

    }

    public static int minCostClimbingStairs(int[] cost) {
        for (int i=2; i< cost.length;i++){
            cost[i] = Math.min(cost[i-1], cost[i-2]) + cost[i];
        }
        return Math.min(cost[cost.length-1], cost[cost.length-2]);
    }
}
