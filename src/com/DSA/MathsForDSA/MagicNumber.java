package com.DSA.MathsForDSA;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(nthMagicNumber(n));
    }
    public static int nthMagicNumber(int n){
        int ans = 0;
        int base = 5;
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        return ans;
    }
}
