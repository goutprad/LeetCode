package com.dsa.lb.recursion;

public class RecusiveDigitSum {
    public static void main(String[] args) {
        String n = "9875";
        int k = 4;
        System.out.println(superDigit(n, k));
    }
    public static int superDigit(String n, int k){
            int ans = sum(n);
            ans =  k * ans;
            ans = sum(""+ans);
            return ans;
    }
    public static int sum(String v){
        if(v.length() == 1)
            return Integer.parseInt(v);
        int temp = 0;
        while(v.length() > 1) {
            int ans = 0;
            for (int i = 0; i < v.length(); i++) {
                ans += v.charAt(i) - '0';
            }
            v = ""+ ans;
            temp = ans;
        }
        return temp;
    }
}
