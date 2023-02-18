package com.dsa.lb.array;

import java.util.LinkedList;
import java.util.List;

public class addToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = {2, 1, 5};
        int k = 56806;
        System.out.println(addToArrayForm(num, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> out = new LinkedList<>();
        for (int i = num.length - 1; i >= 0; i--) {
            int n = num[i];
            int sum = n + k;
            out.add(0, sum%10);
            k = sum / 10;
            System.out.println(k);
        }
        while (k > 0){
            out.add(0, k%10);
            k/=10;
        }

        return out;
    }
}
