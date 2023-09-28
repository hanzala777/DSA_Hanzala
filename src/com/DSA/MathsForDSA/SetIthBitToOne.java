package com.DSA.MathsForDSA;

public class SetIthBitToOne {
    public static void main(String[] args) {
        int n = 19; // (19)base10 = (1 0 0 1 1)base2
        System.out.println(setIthBitToOne(n,4)); //setting the 4th bit to 1 and printing the new n
        System.out.println(setIthBitToZero(n,2)); //setting the 2nd bit to 0 and printing the new n
    }
    public static int setIthBitToOne(int n, int bit){
        return n | (1 << (bit-1));
    }
    public static int setIthBitToZero(int n, int bit){
        return n & ~(1 << (bit-1));
    }
}
