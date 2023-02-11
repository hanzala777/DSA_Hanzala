package com.DSA.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
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
        int ans=search(arr,item);
        if(ans==-1)
            System.out.println("-> Number Not found!! ");
        else
            System.out.println("-> " + item + " Found at index :" + ans);

        //True or false : Is the item present in the array
        System.out.println("-> Is " + item + " in array : " + inArray(arr,item));

        //Smallest value in the given array
        System.out.println("-> Smallest value in the array is: " + findMin(arr));
    }

    static int findMin(int[] arr){
        int min=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
    static int search(int[] arr,int item){
        if(arr.length==0)
            return -1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==item)
                return i;
        }
        return -1;
    }
    static boolean inArray(int[] arr,int item){
        if(arr.length==0)
            return false;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==item)
                return true;
        }
        return false;
    }
}
