package com.dsa.lb;

public class SumDiff {
    public static void main(String[] args) {
        int[] a = {10,20,30,40};
        int[] b = {20,25,30,35};
        int evenSum =0 ;
        int oddSum =0 ;
        for (int i=0;i<a.length;i++){
            if(i%2 == 0){
                evenSum += a[i];
            }
            if(i%2 != 0){
                oddSum += a[i];
            }
        }
        System.out.println(evenSum+" : "+oddSum);
    }
}
