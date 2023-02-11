package com.DSA.LinearSearch;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i< arr.length;i++)
            arr[i]=sc.nextInt();
        for(int a:arr)
            System.out.print(a + " ");
        System.out.println("Enter the range to search :");
        int start= sc.nextInt();
        int end=sc.nextInt();
        System.out.println("\nMAX Value is:"+max(arr));
        System.out.println(maxRange(arr,start,end));
    }
    static int max(int[] arr){
        int maxVal=arr[0];
        for(int i : arr){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
    static int maxRange(int[] arr,int start,int end){
        int maxVal=start;
        for(int i=start;i<=end;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
