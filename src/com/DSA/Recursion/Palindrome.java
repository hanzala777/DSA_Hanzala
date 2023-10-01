package com.DSA.Recursion;

public class Palindrome {
    public static void main(String[] args) {
        int n = 123421;
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int n){
        reverse(n);
        return n == sum; // here sum is the reverse of the number
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
