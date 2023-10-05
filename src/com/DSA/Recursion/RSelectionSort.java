package com.DSA.Recursion;

import java.util.Arrays;

public class RSelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,-1,5,0,-4,-3};
        rSelectionSort(arr, arr.length, 0,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void rSelectionSort(int[] arr, int n, int index, int max){
        if(n == 0)
            return;
        if(n > index){
            if(arr[index] > arr[max]){
                rSelectionSort(arr, n, index+1, index);
            }
            else
                rSelectionSort(arr, n, index+1, max);
        }
        else {
            int temp = arr[max];
            arr[max] = arr[n-1];
            arr[n-1] = temp;
            rSelectionSort(arr,n-1,0,0);
        }
    }
}
