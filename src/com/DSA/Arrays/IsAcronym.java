package com.DSA.Arrays;
// leetcode
import java.util.Arrays;
import java.util.List;

public class IsAcronym {
    public static void main(String[] args) {
        List<String> str_arr = Arrays.asList("never","gonna","give","up","on","you");
        String s = "ngguoy";
        boolean ans = isAcronym(str_arr, s);
        System.out.println(ans);
    }
    public static boolean isAcronym(List<String> words, String s) {
//        String a = "";
//        for(int i = 0; i<words.size(); i++){
//            a += words.get(i).charAt(0);
//        }
//        return a.equals(s);

        // BETTER SOLUTION

        StringBuilder a=new StringBuilder();
        for (String word : words) {
            a.append(word.charAt(0));
        }
        return a.toString().equals(s);
    }
}
