package com.DSA.Recursion;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        subSequence("", "abcd");
        System.out.println(subSeq("", "abcd"));
    }
    static void subSequence(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subSequence(p+ch, up.substring(1));
        subSequence(p, up.substring(1));
    }
    static ArrayList<String> subSeq(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeq(p+ch, up.substring(1));
        ArrayList<String> right = subSeq(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
