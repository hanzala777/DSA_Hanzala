package com.DSA.BinarySearch;

public class CharCieling {
    public static void main(String[] args) {
        //printing Smallest character greater than the target...
        char[] letters={'a','b','c','d','f','h','k','q'};
        System.out.println(charCeiling(letters,'f'));
    }
    static char charCeiling(char[] letters,char target){
        int start=0,end= letters.length-1;

        while(start<=end){
            int middle=start+(end-start)/2;
            if (target < letters[middle])
                end=middle-1;
            else
                start=middle+1;
        }
        return letters[start % letters.length];
    }
}
