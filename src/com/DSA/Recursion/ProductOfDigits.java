package com.DSA.Recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n = 1213302;
        System.out.println(productOfDigits(n));
    }
    static int productOfDigits(int n){
        if(n%10 == n){
            return n;
        }
        return (n%10) * productOfDigits(n/10);
    }
}
