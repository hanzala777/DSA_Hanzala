package com.DSA.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BiSearch {
    public static void main(String[] args) {
        //Assuming the given array is sorted in Ascending order...
        //Worst case time complexity -> O(log n)
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
        int ans=binarySearch(arr,item);
        if(ans==-1)
            System.out.println("-> Number Not Found!!");
        else
            System.out.println("-> " + item + " found at Index " + ans );
    }

    static int binarySearch(int[] arr,int item){
        int start=0,end=arr.length-1;
        while(start <=end){
            //find the middle element
            int middle=start+(end-start)/2;
            if(item<arr[middle]){
                end=middle-1;
            }
            else if(item>arr[middle]){
                start=middle + 1;
            }
            else
                return middle;
        }
        return -1;
    }
}