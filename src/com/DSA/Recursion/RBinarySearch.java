package com.DSA.Recursion;

public class RBinarySearch {
    public static void main(String[] args) {
        int[] arr= {1,3,12,23,43,64};
        int ans = recursiveBS(arr, 14, 0, arr.length-1);
        System.out.println(ans);
    }
    static int recursiveBS(int[] arr, int target, int start, int end){
        if(start>end)
            return -1;
        int mid = start +(end - start) / 2;
        if(arr[mid] == target)
            return mid;
        if(arr[mid] < target)
            recursiveBS(arr, target, mid+1, end);

        return recursiveBS(arr, target, start, mid-1);
    }
}
