package com.DSA.Recursion;

import java.util.ArrayList;

public class RLinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,7,76,9};
        int target=4;
        System.out.println(linearSearch(arr,target,0)); // returns true or false
        System.out.println(linearSearchIndex(arr,target,0)); // returns index
        System.out.println(findAllIndex(arr,target,0,new ArrayList<>())); // return index of all occurrences
        System.out.println(findAllIndex2(arr,target,0)); // return index of all occurrences

    }
    static boolean linearSearch(int[] arr, int target, int index){
        if(index == arr.length)
            return false;
        return arr[index] == target || linearSearch(arr,target,index+1);
    }
    static int linearSearchIndex(int[] arr, int target, int index){
        if(index == arr.length)
            return -1;
        if(arr[index] == target)
            return index;
        return linearSearchIndex(arr,target,index+1);
    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length)
            return list;
        if(arr[index] == target)
            list.add(index);
        return findAllIndex(arr,target,index+1,list);
    }
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length)
            return list;

        // this will contain answer for that function call only
        if(arr[index] == target)
            list.add(index);

        ArrayList<Integer> ansFromAboveCall = findAllIndex2(arr,target,index+1);
        list.addAll(ansFromAboveCall);
        return list;
    }
}
