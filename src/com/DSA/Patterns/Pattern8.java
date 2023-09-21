package com.DSA.Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        pattern8(4);
    }
    static void pattern8(int n) {
//              1
//            2 1 2
//          3 2 1 2 3
//        4 3 2 1 2 3 4
//          3 2 1 2 3
//            2 1 2
//              1
        for(int row=0; row<2*n; row++){

            int totalColsInRow = row>n ? 2*n-row:row;
            int noOfSpaces = n -totalColsInRow;

            for(int s=0; s< noOfSpaces; s++){
                System.out.print("  ");
            }
            for(int col = totalColsInRow; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for(int col = 2; col<=totalColsInRow; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
