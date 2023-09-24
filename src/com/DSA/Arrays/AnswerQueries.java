package com.DSA.Arrays;

import java.util.Arrays;

class AnswerQueries {
    public static void main(String[] args) {
        int[] arr = {4,5,2,1};
        int[] queries = {3,10,21};
        int[] answer = answerQueries(arr, queries);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] answerQueries(int[] nums, int[] queries) {
        int[] ans = new int[queries.length];
        Arrays.sort(nums);
        int sum = 0;
        int count = 0;
        for(int i = 0; i < queries.length; i++){
            for(int j = 0; j < nums.length; j++){
                sum += nums[j];
                if(sum <= queries[i])
                    count += 1;
                else
                    break;;
            }
            ans[i] = count;
            count = 0;
            sum = 0;
        }
        return ans;
    }
}