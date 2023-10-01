package com.DSA.Recursion;

public class Reverse {
    public static void main(String[] args) {
        int n = 12304;
        reverse(n);
        System.out.println(sum);
    }
    static int sum = 0;
    static void reverse(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse((n/10));
    }
}
