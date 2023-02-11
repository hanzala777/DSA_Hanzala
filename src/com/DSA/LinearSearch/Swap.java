package com.DSA.LinearSearch;
import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Declaring array of size 6
        int[] arr=new int[6];

        //Initializing input of the array
        for(int i=0;i< arr.length;i++)
            arr[i]=sc.nextInt();

        //printing Array as it is...
        for(int a:arr)
            System.out.print(a + " ");

        System.out.println();

        //Swapping array
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));

        System.out.println();

        //Reversing array
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start=0,end= arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
