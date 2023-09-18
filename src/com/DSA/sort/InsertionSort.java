package com.DSA.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] num = {2,-1,5,0,-4,-3};
        insertionSort(num);
        System.out.println(Arrays.toString(num));
    }
    static void insertionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1])
                    swap(arr, j, j-1);
                else
                    break;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
