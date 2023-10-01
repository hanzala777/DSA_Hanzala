package com.DSA.Recursion;

public class Recursion1 {
    public static void main(String[] args) {
        // We have to print numbers from 1 to not defined
        recursion1(5);
        recursion(1);
    }
    static void recursion(int n){
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.print(n + " ");
        recursion(n+1);
    }
    static void recursion1(int n){
        if(n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        recursion1(n-1);
    }
}
