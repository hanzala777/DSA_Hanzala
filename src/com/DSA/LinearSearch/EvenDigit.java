package com.DSA.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class EvenDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("-> Enter the Array : ");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.println("-> There exists " + findNums(arr) + " even digit elements");
    }
    static int findNums(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num))
                count++;
        }
        return count;
    }
    //function to check whether number contains even digit or not
    static boolean even(int num){
        int numOfDigit=digits(num);
/*
        if(numOfDigit%2==0)
            return true;
        return false;
*/
        return numOfDigit%2==0;
    }
    //count the number of digits in a number
    static int digits(int num){
/*
        if(num < 0)
            num*=-1;

        if(num==0)
            return 1;

        int count=0;

        while(num>0){
            count++;
            num/=10;
        }
        return count;
*/
        return (int)(Math.log10(num))+1;
    }
}