package com.DSA.Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        patterns4(4);
    }
    static void patterns4(int n){
//        1
//        1 2
//        1 2 3
//        1 2 3 4
        for(int row = 0; row < n; row++){
            for(int col = 0; col <= row; col++){
                System.out.print(col+1 + " ");
            }
            System.out.println();
        }
    }
}
