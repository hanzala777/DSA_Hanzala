package com.DSA.Recursion;

public class SkipString {
    public static void main(String[] args) {
        String a = "four apple five bananas";
        System.out.println(skipString(a));
    }
    static String skipString(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipString(up.substring(6));
        }
        else
            return up.charAt(0) + skipString(up.substring(1));
    }
}
