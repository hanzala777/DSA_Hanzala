package com.DSA.LinearSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// LEETCODE
class TargetIndices {
    public static void main(String[] args) {
        int[] num = {1,3,4,2,2};
        List<Integer> ans = targetIndices(num, 2);
        System.out.println(ans);
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target)
                ans.add(i);
        }
        return ans;
    }
}