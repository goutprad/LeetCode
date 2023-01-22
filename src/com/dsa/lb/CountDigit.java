package com.dsa.lb;

public class CountDigit {
    public static void main(String[] args) {
int a = 454;
        countDigit(a,4);
        System.out.println(String.valueOf(a).length());
        reverse(a);
    }
    public static int countDigit(int a, int target){
        int counter=0;

        while(a>0){
            int r = a%10;

            if(a%10 == target){
                counter++;
            }
            a = a/10;
        }

        return 0;
    }
    public static int reverse(int a){
        int rev=0;
        while(a > 0){
            int r = a % 10;
            rev = rev * 10 +r;
           a =  a /10;
        }
        return rev;
    }
}
