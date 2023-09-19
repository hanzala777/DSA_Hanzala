package com.DSA.sort;

import java.util.Arrays;

class Duplicate {
    public static void main(String[] args) {
        int[] num = {1,3,4,2,2};
        int ans=findDuplicate(num);
        System.out.println(ans);
    }
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct])
                swap(nums, i, correct);
            else
                i++;
        }

        for(int index=0; index<nums.length; index++){
            if(nums[index] != index+1)
                return nums[index];
        }
        return -1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}