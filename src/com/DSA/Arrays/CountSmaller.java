package com.DSA.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CountSmaller {
    public static void main(String[] args) {
        int[] arr = {5,2,6,1};
        List<Integer> ans = countSmaller(arr);
        System.out.println(ans);
    }
    public static List<Integer> countSmaller(int[] nums) {
//        List<Integer> ans = new ArrayList<>();
//        int count = 0;
//        for(int i = 0; i < nums.length; i++){
//            for(int j = i+1; j < nums.length; j++){
//                if(nums[i] > nums[j])
//                    count += 1;
//            }
//            ans.add(count);
//            count = 0;
//        }
//        return ans;
        // CAN'T CONSIDER ABOVE SOLUTION BECAUSE TIME LIMIT EXCEEDS . . .

        int len = nums.length;
        List<Integer> ans = new ArrayList<Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int num: nums) arr.add(num);
        Collections.sort(arr);
        for(int i = 0; i<len; i++){
            int index = binarySearch(arr,nums[i]);
            ans.add(index);
            //every time we are removing the element whose index is already found in sorted array
            arr.remove(index);
        }
        return ans;
    }
    public static int binarySearch(List<Integer> arr, int target){
        int start = 0;
        int end = arr.size()-1;
        int mid=0;
        int res=0;
        while(start<=end){
            mid = start + ((end - start)/2);
            int val = arr.get(mid);
            if(val<target) start = mid + 1;
            else if(val==target)
            {
                end=mid-1;
                res=mid;
            }
            else end = mid - 1;
        }
        return res;
    }
}