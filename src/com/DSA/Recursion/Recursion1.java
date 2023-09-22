package com.DSA.Recursion;

public class Recursion1 {
    public static void main(String[] args) {
        // We have to print numbers from 1 to not defined
        recursion(1);
    }
    static void recursion(int n){
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        recursion(n+1);
    }
}
