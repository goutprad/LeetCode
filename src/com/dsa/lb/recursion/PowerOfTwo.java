package com.dsa.lb.recursion;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(2));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 1)
            return true;
        if (n%2 != 0)
            return false;
        if(n ==0 )
            return true;
        return isPowerOfTwo(n/2);
    }
}
