package com.DSA.Recursion;

public class Sum {
    public static void main(String[] args) {
        int n = sum(5);
        System.out.println(n);
    }
    static int sum(int n){
        if(n <= 1)
            return 1;
        return n + sum(n - 1);
    }
}
