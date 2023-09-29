package com.DSA.MathsForDSA;

public class NumberOfSetBits {
    public static void main(String[] args) {
        int n = 10; // (10) base 10 --> (1010) base 2 --> number of 1s in 1010 is 2
        System.out.println(numberOfSetBits(n));
    }
    public static int numberOfSetBits(int n){
        int count = 0;
        while (n > 0){
            count++;
            n -= (n & -n);
        }
        return count;
    }
}
