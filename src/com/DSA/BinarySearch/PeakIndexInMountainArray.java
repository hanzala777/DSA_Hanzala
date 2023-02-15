package com.DSA.BinarySearch;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr={1,12,21,23,11,10,9};
        System.out.println("Greatest element in array is found at Index : " + peakElement(arr)) ;
    }
    static int peakElement(int[] arr){
        int start=0,end= arr.length-1;
        while(start<end){
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
        //in the end, start == end and pointing to the largest number
        //because of two checks above
        return start;//can also return end because they both are EQUAL
    }
}
