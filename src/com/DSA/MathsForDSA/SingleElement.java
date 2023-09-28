package com.DSA.MathsForDSA;

public class SingleElement {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,3,2};
        int ans = singleElement(arr);
        System.out.println(ans);
    }
    public static int singleElement(int[] nums){
        int unique = 0;
        for (int num : nums) {
            unique ^= num;
        }
        return unique;
    }
}
