package com.DSA.Recursion;

public class RPattern2 {
    public static void main(String[] args) {
        int n = 5;
        rPattern2(n,0);
    }
    static void rPattern2(int row, int col){
        if(row == 0)
            return;
        if (row > col) {
            rPattern2(row, col + 1);
            System.out.print("* ");
        } else {
            rPattern2(row - 1, 0);
            System.out.println();
        }
    }
}
