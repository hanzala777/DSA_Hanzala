package com.DSA.Recursion;

public class Zeroes {
    public static void main(String[] args) {
        int n = noOfZeroes(20908030);
        System.out.println(n);
    }
    public static int noOfZeroes(int n){
        return helper(n, 0);
    }
    private static int helper(int n, int c){
        if(n == 0)
            return c;
        int rem = n % 10;
        if(rem == 0)
            return helper(n/10, c+1);
        return helper(n/10, c);
    }
}
