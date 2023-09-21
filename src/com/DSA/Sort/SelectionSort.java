package com.DSA.Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] num = {2,-1,5,0,-4,-3};
        selectionSort(num);
        System.out.println(Arrays.toString(num));
    }
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxInd= maxIndex(arr,0,last+1);;
            swap(arr, maxInd, last);
        }

    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int maxIndex(int[] arr,int start, int end){
        int max = start;
        for(int i=0;i< end;i++) {
            if (arr[max] < arr[i])
                max = i;
        }
        return max;
    }
}
