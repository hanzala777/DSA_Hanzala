package com.DSA.BinarySearch;

public class BSRotatedDuplicateElements {
    public static void main(String[] args) {
        int[] arr={2,2,2,2,9,2,2,2};
        int target=7;
        System.out.println(searchRSA(arr,target));
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
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start <= end){
            int middle=start+(end-start)/2;
            if(target<arr[middle]){
                end=middle-1;
            }
            else if(target>arr[middle]){
                start=middle + 1;
            }
            else
                return middle;
        }
        return -1;
    }
    //Method for Binary search in Rotated sorted array
    static int searchRSA(int[] arr, int target){
        //Find the pivot in the array
        //pivot:From where your next Numbers are ascending
        int pivot=findPivotWithDuplicates(arr);
        //if you didn't find the pivot, it means the array is not rotated.
        if (pivot == -1){
            //just do normal binary search...
            return binarySearch(arr,target,0,arr.length-1);
        }
        //if pivot is found , you have found 2 ascending sorted array
        if (arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr, target,pivot+1, arr.length-1);
    }
}
