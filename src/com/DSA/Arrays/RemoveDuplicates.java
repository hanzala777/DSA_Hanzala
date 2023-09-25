package com.DSA.Arrays;


public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }
    public static int removeDuplicates(int[] nums) {
        int count = 1;
        for(int i = 1;i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
