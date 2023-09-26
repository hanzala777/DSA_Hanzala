package com.DSA.Arrays;
// Leetcode
import java.util.Arrays;
public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {2,2,1,4,4};
        int[] ans = runningSum(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] sums = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            nums[i] += sum;
            sum = nums[i];
            sums[i] = sum;
        }
        return sums;
    }
}
