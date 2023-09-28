package com.DSA.MathsForDSA;

public class IsEven {
    public static void main(String[] args) {
        int n = 110;
        System.out.println(isOdd(n));
    }
    public static boolean isOdd(int n) {
        return ((n&1) == 1);
    }
}
