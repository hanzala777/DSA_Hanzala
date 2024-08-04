package com.DSA.Arrays;


public class SecondLargest {
    public static int secondLargest(int[] arr){
        if (arr == null || arr.length < 2) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,13,14,56};
        System.out.println(secondLargest(arr));
    }
}
