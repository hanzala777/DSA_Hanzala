package com.DSA.BinarySearch;
//Mountain array is also known as biotonic array
public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr={1,12,21,23,11,10,9};
        int target=23;
        System.out.println(target + " found at Index : " + search(arr,target)) ;
    }
    static int search(int[] arr,int target){
        int peak=peakIndex(arr);
        int firstTry=orderAgnosticBS(arr,target,0,peak);
        if (firstTry != -1)
            return firstTry;

        return orderAgnosticBS(arr,target,peak+1,arr.length-1);
    }
    static int peakIndex(int[] arr){
        int start=0,end= arr.length-1;
        while(start < end){
            int middle=start+(end-start)/2;
        if (arr[middle]>arr[middle+1])
            //You are in decreasing part of array
            //this may be the Answer
            //Therefore end != mid-1
            end=middle;
        else
            //You are in increasing part of array
            start=middle+1;
            //because we know that arr[middle+1] > arr[middle]
        }
        return start;
    }
    static int orderAgnosticBS(int[] arr,int item,int start,int end){
        //find whether the array is sorted in ascending or descending
        boolean isAsc=arr[start]<arr[end];

        while(start <=end){
            //find the middle element
            int middle=start+(end-start)/2;

            if(arr[middle] == item)
                return middle;

            if(isAsc){
                if(item<arr[middle])
                    end=middle-1;
                else
                    start=middle + 1;
            }
            else{
                if(item > arr[middle])
                    end=middle-1;
                else
                    start=middle + 1;
            }
        }
        return -1;
    }
}
