package com.DSA.Arrays;
// Leetcode
public class CountPairs {
    public static void main(String[] args) {
        int[] arr = {5,5,9,2,5,5,9,2,2,5,5,6,2,2,5,2,5,4,3};
        int k = 7;
        int ans = countPairs(arr, k);
        System.out.println(ans);
    }
    public static int countPairs(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i< nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                if(nums[i] == nums[j] && i*j % k == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
