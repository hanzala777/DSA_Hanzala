package com.DSA.Recursion;

import java.util.Arrays;

public class RBubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        rBubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void rBubbleSort(int[] arr,int n, int index){
        if(n == 0)
            return;
        if(n > index){
            if(arr[index] > arr[index + 1]) {
                int temp = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = temp;
            }
            rBubbleSort(arr,n,index+1);
        }
        else{
            rBubbleSort(arr,n-1,0);
        }
    }
}
