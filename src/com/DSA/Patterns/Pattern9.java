package com.DSA.Patterns;

public class Pattern9 {
    public static void main(String[] args) {
        pattern9(4);
    }
    static void pattern9(int n){
//        4 4 4 4 4 4 4
//        4 3 3 3 3 3 4
//        4 3 2 2 2 3 4
//        4 3 2 1 2 3 4
//        4 3 2 2 2 3 4
//        4 3 3 3 3 3 4
//        4 4 4 4 4 4 4
        for(int row = 1; row < 2*n; row++){
            for(int col = 1; col < 2*n; col++){
                int atEveryIndex =(n+1)-(Math.min(Math.min(row,col),Math.min(2*n-row,2*n-col)));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
