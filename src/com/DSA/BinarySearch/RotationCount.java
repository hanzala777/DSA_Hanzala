package com.DSA.BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr={2,2,2,2,2,9,10,2,2,2};
        System.out.println(rotationCount(arr));
    }
    static int findPivot(int[] arr){
        int start=0,end=arr.length-1;
        while(start<=end) {
            int middle = start + (end - start) / 2;
            //4 cases over here
            if (middle<end && arr[middle] > arr[middle + 1]){
                return middle;
            }
            if (middle>start && arr[middle] < arr[middle - 1]) {
                return middle-1;
            }
            if (arr[middle] <= arr[start]){
                end=middle-1;
            }else{
                start=middle+1;
            }
        }
        return -1;
    }
    static int findPivotWithDuplicates(int[] arr){
        int start=0,end=arr.length-1;
        while(start<=end) {
            int middle = start + (end - start) / 2;
            //4 cases over here
            if (middle<end && arr[middle] > arr[middle + 1]){
                return middle;
            }
            if (middle>start && arr[middle] < arr[middle - 1]) {
                return middle-1;
            }
            //if elements at middle, start, and end are equal then just skip the duplicates
            if (arr[middle]==arr[start] && arr[middle]==arr[end]){
                //skip the duplicates
                //NOTE: what if these elements at start and end were the pivots
                //check if start is pivot
                if(arr[start]>arr[start+1])
                    return start;
                start++;
                if(arr[end] < arr[end-1])
                    return end-1;
                end--;
            }
            //left side is sorted, so pivot should be in right
            else if (arr[start] < arr[middle] || (arr[start] == arr[middle] && arr[middle] > arr[end])) {
                start=middle+1;
            }else
                end =middle-1;
        }
        return -1;
    }
    static int rotationCount(int[] arr){
        if (findPivot(arr) != -1)
            return findPivot(arr)+1;
        return findPivotWithDuplicates(arr)+1;
    }
}
