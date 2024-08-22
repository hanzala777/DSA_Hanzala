package com.DSA.Patterns;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args){
//        1 5 8 10
//        2 6 9
//        3 7
//        4

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;
        for(int row = 1; row <= n+1; row++){
            int temp = n;
            for(int col = 1; col <= n-row+1; col++){
                System.out.print(a + " ");
                a += temp;
                temp--;
            }
            a = row+1;
            System.out.println();
        }
    }
}
