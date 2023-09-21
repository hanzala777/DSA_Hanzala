package com.DSA.Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        pattern7(4);
    }
    static void pattern7(int n){
//              1
//            2 1 2
//          3 2 1 2 3
//        4 3 2 1 2 3 4
        for(int row = 1; row <= n;row++){
            int noOfSpaces=n-row;
            for(int s=0; s<noOfSpaces; s++){
                System.out.print("  ");
            }
            for(int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for(int col = 2; col <= row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
