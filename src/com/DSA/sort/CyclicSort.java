package com.DSA.sort;

import java.util.Arrays;

// When given numbers from range 1 to N ==> USE CYCLIC SORT
public class CyclicSort {
    public static void main(String[] args) {
        int[] num = {2,1,5,4,3};
        cyclicSort(num);
        System.out.println(Arrays.toString(num));
    }
    static void cyclicSort(int[] arr){
//        for(int i=0;i< arr.length-1; i++){
//            if(i != arr[i]-1){
//                swap(arr, i, arr[i]-1);
//            }
//        }
        int i = 0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i] != arr[correct])
                swap(arr, i, correct);
            else
                i++;
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
