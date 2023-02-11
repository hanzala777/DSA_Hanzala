package com.DSA.BinarySearch;

public class Floor {
    public static void main(String[] args) {
        //Greatest number in the array which is Smaller than or equal to target...
        int[] arr={12, 23, 34, 45, 56, 67};
        System.out.println(floor(arr,68));
    }
    static int floor(int[] arr,int target){
        int start=0,end= arr.length-1;
        if(target < arr[start])
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
        return arr[end];
    }
}

