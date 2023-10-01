package com.DSA.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(factorial(n));
    }
    static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
