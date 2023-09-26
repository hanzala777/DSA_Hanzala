package com.DSA.Arrays;

import java.util.Arrays;

//  2679. Sum in a Matrix
//  You are given a 0-indexed 2D integer array nums. Initially, your score is 0. Perform the following operations until the matrix becomes empty:
//
//       -> From each row in the matrix, select the largest number and remove it. In the case of a tie, it does not matter which number is chosen.
//       -> Identify the highest number amongst all those removed in step 1. Add that number to your score.
//       -> Return the final score.
public class MatrixSum {
    public static void main(String[] args) {
        int[][] matrix = {{7,2,1},{6,4,2},{6,5,3},{3,2,1}};
        int ans = matrixSum(matrix);
        System.out.println(ans);
    }
    public static int matrixSum(int[][] nums) {
        int score = 0;
        for(int[] a : nums)
            Arrays.sort(a);
        for(int col = 0; col < nums[0].length; col++){
            int max = 0;
            for (int[] num : nums) {
                max = Math.max(max, num[col]);
            }
            score += max;
        }
        return score;
    }
}
