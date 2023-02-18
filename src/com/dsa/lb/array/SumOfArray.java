package com.dsa.lb.array;

import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int a[] = {9, 4, 5, 6, 8, 9};
        int b[] = {9, 7, 8, 9};
        int maxLen = Math.max(a.length, b.length);
        int res[] = new int[maxLen + 1];
        int aLen = a.length;
        int bLen = b.length;
        int carry = 0;
        int first = 0;
        int second = 0;
        while (maxLen >= 0) {
            if (aLen > 0) {
                first = a[aLen - 1];
            }
            if (bLen > 0) {
                second = b[bLen - 1];
            }
            int sum = first + second + carry;
            int value = sum % 10;
            res[maxLen] = value;
            carry = sum / 10;
            aLen--;
            bLen--;
            maxLen--;
            first = 0;
            second = 0;
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(add(a, b)));
    }

    public static int[] add(int[] a, int[] b) {
        int[] res = new int[Math.max(a.length, b.length) + 1];
        int aLen = a.length - 1, bLen = b.length - 1, resLen = res.length-1, carry = 0;
        while (aLen >= 0 || bLen >= 0) {
            int num = carry;
            if (aLen >= 0) {
                num+=a[aLen--];
            }
            if (bLen >= 0) {
                num += b[bLen--];
            }
            res[resLen--] = num%10;
            carry = num/10;
        }
        if(carry != 0){
            res[resLen] = carry;
        }
        return res;
    }

}
