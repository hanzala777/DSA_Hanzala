package com.DSA.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = sumOfDigits(623);
        System.out.println(n);
    }
    static int sumOfDigits(int n){
        if(n == 0)
            return 0;
        return sumOfDigits(n/10)+ n%10;
    }
}
