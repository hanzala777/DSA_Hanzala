package com.DSA.Recursion;

public class RLinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,7,76,9};
        int target=76;
        System.out.println(linearSearch(arr,target,0));
    }
    static boolean linearSearch(int[] arr, int target, int index){
        if(index == arr.length)
            return false;
        return arr[index] == target || linearSearch(arr,target,index+1);
    }
}
