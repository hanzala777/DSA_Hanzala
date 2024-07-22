package com.DSA.MapsDicts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSort {
    private static int[] countSort(int[] array){

        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                array[i] = max;
            }
        }

        int[] countArray = new int[max+1];
        for(int num : array){
            countArray[num]++;
        }
        int index = 0;
        for(int i = 0; i < countArray.length; i++){
            while(countArray[i] > 0){
                array[index] = i;
                index++;
                countArray[i]--;
            }
        }
        return array;
    }
    private static int[] countSortHash(int[] array){
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();

        Map<Integer, Integer> countMap = new HashMap<>();

        for(int num : array){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        int index = 0;
        for(int i = min; i < max; i++){
            int count = countMap.getOrDefault(i, 0);
            for (int j = 0; j < count; j++) {
                array[index] = i;
                index++;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {10, 5, 7, 8, 2, 4, 6, 7};
        int[] ans = countSort(array);
        int[] ans1 = countSortHash(array);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans1));
    }
}
