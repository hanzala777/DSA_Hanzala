package com.DSA.BinarySearch;
public class BSRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3,4};
        int target=7;
        System.out.println(searchRSA(arr,target));
    }
    //Method for Finding pivot
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
        int pivot=findPivot(arr);
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