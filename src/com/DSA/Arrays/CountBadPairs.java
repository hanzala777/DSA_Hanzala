package com.DSA.Arrays;
//2364. Count Number of Bad Pairs
//
//You are given a 0-indexed integer array nums.
// A pair of indices (i, j) is a bad pair if i < j and j - i != nums[j] - nums[i].
//Return the total number of bad pairs in nums.
public class CountBadPairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        long ans = countBadPairs(arr);
        System.out.println(ans);
    }
    public static long countBadPairs(int[] nums) {
        long count = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(j - i != nums[j] - nums[i])
                    count++;
            }
        }
        return count;
    }
}
// TESTCASE DIDN'T PASS . . .
// WILL BE DOING AFTER HASHMAP LEARNING
