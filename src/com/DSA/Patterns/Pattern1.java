package com.DSA.Patterns;
// 1) Approach : run Outer for loop for number of rows time
// 2) Identify for every row number of columns or type of element in column
public class Pattern1 {
    public static void main(String[] args) {
        pattern1(4);
    }
    static void pattern1(int n){
//        *
//        * *
//        * * *
//        * * * *

        for(int row = 0; row < n; row++){
            for(int col = 0; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
