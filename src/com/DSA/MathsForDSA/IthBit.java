package com.DSA.MathsForDSA;

public class IthBit {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(ithBit(n,3));
    }
    public static int ithBit(int n, int bit){
        return n & (1 << (bit-1));
    }
}
