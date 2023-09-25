package com.DSA.Arrays;

// Leetcode
class MinOperations {
    public static void main(String[] args) {
        int[] arr = {1,1,4,2,3};
        int x = 5;
        int ans = minOperations(arr, x);
        System.out.println(ans);
    }
    public static int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int maxLength = -1;
        int currSum = 0;
        int i = 0, j = 0;
        while(i < nums.length){
            currSum += nums[i];
            while(j <= i && currSum > sum - x){
                currSum -= nums[j++];
            }
            if(currSum == sum - x)
                maxLength = Math.max(maxLength, i - j +1);
            i++;
        }
        if(maxLength == -1)
            return -1;
        else
            return nums.length - maxLength;
    }
}