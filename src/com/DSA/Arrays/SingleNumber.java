package com.DSA.Arrays;
//leetcode
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {2,2,1,4,4};
        int ans = singleNumber(arr);
        System.out.println(ans);
    }
    public static int singleNumber(int[] nums) {
        int result=0;
        for (int num : nums) {
            result = result ^ num; // Bitwise XOR operator 1st occurrence will be added in result and 2nd will be deducted
        }
        return result;
    }
}
