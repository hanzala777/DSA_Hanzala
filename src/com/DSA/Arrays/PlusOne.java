package com.DSA.Arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9,1,9};
        int[] ans = plusMain(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] plusMain(int[] digits){
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
