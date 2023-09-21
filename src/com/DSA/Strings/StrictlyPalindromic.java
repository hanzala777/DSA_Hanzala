package com.DSA.Strings;

public class StrictlyPalindromic {
    public static void main(String[] args) {
        int n=1;
        System.out.println(isStrictlyPalindromic(n));
    }
    public static boolean isStrictlyPalindromic(int n) {
        for(int i=2; i<=n-2;i++){
            if(!isPalindrome(Integer.toString(n,i)))
                return false;
        }
        return true;
    }
    static boolean isPalindrome(String str){
        str=str.toLowerCase();
        for(int i=0; i<=str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start != end)
                return false;
        }
        return true;
    }
}
