package com.DSA.Recursion;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
//        pad("", "19");
        System.out.println(letterCombinations("","12"));
    }
    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for(int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char)('a' + i);
            pad(p+ch, up.substring(1));
        }
    }
    public static List<String> letterCombinations(String p, String up) {
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        List<String> list = new ArrayList<>();

        for(int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char)('a' + i);
            list.addAll(letterCombinations(p+ch, up.substring(1)));
        }
        return list;
    }
}
