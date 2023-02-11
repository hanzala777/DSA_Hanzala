package com.DSA.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BiSearch1 {
    public static void main(String[] args) {
        //Assuming the given array is sorted in Descending order...
        Scanner sc=new Scanner(System.in);
        System.out.println("-> Enter the Array:");
        int[] arr=new int[5];
        //reading the array
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        //printing an array
        System.out.println(Arrays.toString(arr));

        //Linear search
        System.out.println("-> Enter the element to search :");
        int item=sc.nextInt();
        int ans=binarySearch1(arr,item);
        if(ans==-1)
            System.out.println("-> Number Not Found!!");
        else
            System.out.println("-> " + item + " found at " + ans +"th Index.");
    }
    static int binarySearch1(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target<arr[mid])
                start=mid+1;
            else if (target>arr[mid])
                end=mid-1;
            else
                return mid;
        }
        return -1;
    }
}
