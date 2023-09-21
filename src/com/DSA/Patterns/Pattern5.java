package com.DSA.Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        patterns5(4);
    }
    static void patterns5(int n){
//        *
//        * *
//        * * *
//        * * * *
//        * * *
//        * *
//        *

        for(int row = 0; row < 2*n; row++){
//            if(row<=n) {
//                for (int col = 0; col < row; col++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//            else{
//                for(int col = 0; col < 2*n-row; col++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
            //OR
            int totalColsInRow = row>n ? 2*n-row:row;
            for(int col = 0; col<totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
