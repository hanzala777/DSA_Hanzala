package com.DSA.Arrays;

public class SearchInsert {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 2;
        int ans = searchInsert(arr,target);
        System.out.println(ans);
    }
    public static int searchInsert(int[] nums, int target) {
        int start=0,end= nums.length-1;
        if(target > nums[end])
            return nums.length;
        while(start<=end){
            int middle=start+(end-start)/2;
            if(target > nums[middle])
                start=middle+1;
            else if (target < nums[middle])
                end=middle-1;
            else
                return middle;
        }
        return start;
    }
}
