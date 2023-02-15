package com.DSA.BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr={1,12,23,44,55,56,67,68,69,70,81,82,93,114,132};
        int target = 93;
        System.out.println(target + " Found at Index: " + ans(arr,target));
    }
    static int ans(int[] arr, int target){
        //first find the range
        //first start with the box of size 2
        int start=0;
        int end=1;
        // condition for the target to lie in the range
        while(target>arr[end]){
            int temp = end + 1;
            //Double the box value
            //end = previous end + sizeOfBox*2
            end = end + (end - start + 1)*2;
            start=temp;
        }
        return infiniteArray(arr,target,start,end);
    }
    static int infiniteArray(int[] arr,int target,int start,int end){

        while(start<=end){
            int middle=start+(end-start)/2;

            if(target<arr[middle])
                end=middle-1;
            else if (target>arr[middle])
                start=middle+1;
            else
                return middle;

        }
        return -1;
    }
}
