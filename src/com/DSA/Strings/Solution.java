package com.DSA.Strings;

class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcdefa";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(areDistinct(s,i,j))
                    res = Math.max(res, j-i+1);
            }
        }
        return res;
    }
    public static boolean areDistinct(String str, int i, int j){
        boolean[] visited = new boolean[128];
        for(int k = i; k <= j; k++){
            if(visited[str.charAt(k)])
                return false;
            visited[str.charAt(k)] = true;
        }
        return true;
    }
}