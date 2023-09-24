package com.DSA.Arrays;

import java.util.Arrays;

class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        int[] ans = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j])
                    count += 1;
            }
            answer[i] = count;
            count = 0;
        }
        return answer;
    }
}