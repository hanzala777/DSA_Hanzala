package com.DSA.MathsForDSA;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n){
        if(n == 0)
            return false;
        return (n & (n-1)) == 0;  // (1 0 0 0 0) & (0 1 1 1 1)
    }
}
