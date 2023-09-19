package com.DSA.sort;

import java.util.Arrays;

// When given numbers from range 1 to N ==> USE CYCLIC SORT
public class CyclicSort {
    public static void main(String[] args) {
        int[] num = {1,3,4,2,2};
        cyclicSort(num);
        System.out.println(Arrays.toString(num));
    }
    static void cyclicSort(int[] arr) {
        // NUMBERS FROM 1 TO N
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct])
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
