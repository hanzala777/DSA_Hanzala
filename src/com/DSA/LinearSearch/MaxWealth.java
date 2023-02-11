package com.DSA.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class MaxWealth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        System.out.println("-> Enter an 2D Array: ");
        for(int person=0;person< arr.length;person++){
            for(int acc=0;acc<arr[person].length;acc++)
                arr[person][acc]= sc.nextInt();
        }
        for(int[] a : arr)
            System.out.println(Arrays.toString(a));

        System.out.println("-> Maximum wealth :" + maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts){
        //person=row
        //acc=col
        int ans=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            int sum=0;
            for(int acc=0; acc<accounts[person].length ; acc++){
                sum+=accounts[person][acc];
            }
            if(sum>ans)
                ans=sum;
        }
        return ans;
    }
}
