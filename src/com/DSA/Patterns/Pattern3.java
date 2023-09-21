package com.DSA.Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        patterns3(4);
    }
    static void patterns3(int n){
//        * * * *
//        * * *
//        * *
//        *
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
