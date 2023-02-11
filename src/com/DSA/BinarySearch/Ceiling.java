package com.DSA.BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        //Ceiling: Smallest number in the Array which is Greater than or equal to the target...
        int[] arr={12, 23, 34, 45, 56, 67};
        System.out.println(ceiling(arr,10));
    }
    //Assume the array is sorted in Ascending order...
    static int ceiling(int[] arr,int target){
        int start=0,end= arr.length-1;
        if(target > arr[end])
            return -1;
        while(start<=end){
            int middle=start+(end-start)/2;
            if(target > arr[middle])
                start=middle+1;
            else if (target < arr[middle])
                end=middle-1;
            else
                return arr[middle];
        }
        return arr[start];
    }
}
