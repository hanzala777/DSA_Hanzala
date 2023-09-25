package com.DSA.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        int val = 3;
        int ans = removeElement(arr,val);
        System.out.println(ans);
    }
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
