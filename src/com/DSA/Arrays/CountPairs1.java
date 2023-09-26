package com.DSA.Arrays;

// leetcode
import java.util.Arrays;
import java.util.List;

public class CountPairs1 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-6,2,5,-2,-7,-1,3);
        int target = -2;
        int ans = countPairs(arr, target);
        System.out.println(ans);
    }
    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for(int i = 0; i<nums.size(); i++){
            for(int j = i+1; j<nums.size(); j++){
                if(nums.get(i) + nums.get(j) < target){
                    count++;
                }
            }
        }
        return count;
    }
}
