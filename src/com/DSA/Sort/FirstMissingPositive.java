package com.DSA.Sort;

import java.util.Arrays;

//leetcode HARD 41
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] num = {7,8,9,11,12};
        int ans = firstMissingPositive(num);
        System.out.println(Arrays.toString(num));
        System.out.println(ans);
    }
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i]-1;
            if (nums[i] > 0 && nums[i]<= nums.length && nums[i] != nums[correct])
                swap(nums, i, correct);
            else
                i++;
        }
        for(int index=0; index< nums.length; index++){
            if(index+1 != nums[index])
                return index+1;
        }
        return nums.length+1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
