package com.DSA.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Search2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        System.out.println("-> Enter an 2D Array: ");
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++)
                arr[row][col]= sc.nextInt();
        }
        for(int[] a : arr)
            System.out.println(Arrays.toString(a));
        System.out.println("-> Enter the item to search:");
        int item=sc.nextInt();
        System.out.println("-> " + item + " found at " + Arrays.toString(search2D(arr,item)));
        System.out.println("-> Greatest element in the Matrix is: " + max2D(arr));
    }
    static int[] search2D(int[][] arr,int item){
        if(arr.length==0)
            return new int[]{-1,-1};
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++)
                if(arr[row][col]==item)
                    return new int[]{row, col};
        }
        return new int[]{-1,-1};
    }
    static int max2D(int[][] arr){
        int max=arr[0][0];
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++)
                if(arr[row][col]>max) {
                    max = arr[row][col];
                }
        }
        return max;
    }
}
