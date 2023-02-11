package com.DSA.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class OrderAgnosticBS1 {
    public static void main(String[] args) {
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
        int ans=orderAgnosticBS(arr,item);
        if(ans==-1)
            System.out.println("-> Number Not Found!!");
        else
            System.out.println("-> " + item + " found at Index " + ans);
    }
    static int orderAgnosticBS(int[] arr,int item){
        int start=0,end=arr.length-1;
        //find whether the array is sorted in ascending or descending
        boolean isAsc=arr[start]<arr[end];

        while(start <=end){
            //find the middle element
            int middle=start+(end-start)/2;

            if(arr[middle] == item)
                return middle;

            if(isAsc){
                if(item<arr[middle])
                    end=middle-1;
                else
                    start=middle + 1;
            }
            else{
                if(item > arr[middle])
                    end=middle-1;
                else
                    start=middle + 1;
            }
        }
        return -1;
    }
}
