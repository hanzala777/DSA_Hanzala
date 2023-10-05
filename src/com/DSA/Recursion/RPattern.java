package com.DSA.Recursion;

public class RPattern {
    public static void main(String[] args) {
        int n = 4;
        rPattern1(n,0);
    }
    static void rPattern1(int row, int col){
        if(row == 0)
            return;
        if (row > col) {
            System.out.print("* ");
            rPattern1(row, col + 1);
        } else {
            System.out.println();
            rPattern1(row - 1, 0);
        }
    }
}
