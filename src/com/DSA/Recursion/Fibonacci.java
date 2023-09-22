package com.DSA.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int ans = nthFibonacci(50);
        System.out.println(ans);
    }
    static int nthFibonacci(int n){
        //WITHOUT RECURSION
//        int first = 0;
//        int second = 1;
//        int fibo = 0;
//        for(int i = 0; i < n; i++){
//            fibo = first + second;
//            first = second;
//            second=fibo;
//            fibo = fibo-first;
//        }
//        return fibo;

        //WITH RECURSION
        if(n<2){
            return n;
        }

        return nthFibonacci(n-1)+nthFibonacci(n-2);
    }
}
