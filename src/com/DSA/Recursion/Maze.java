package com.DSA.Recursion;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        int ans = count(3, 3);
        System.out.println(ans);

        path("",3,3);

        ArrayList<String> list = retPath("",3,3);
        System.out.println(list);

        ArrayList<String> listD = retPathDiagonal("",3,3);
        System.out.println(listD);
        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathObs("",board,0,0);
    }
    static int count(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int down = count(r-1,c);
        int right = count(r,c-1);
        return down + right;
    }
    static void path(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            path(p+'D',r-1,c);
        }
        if(c > 1){
            path(p+'R',r,c-1);
        }
    }
    static ArrayList<String> retPath(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r > 1){
            ans.addAll(retPath(p+'D',r-1,c));
        }
        if(c > 1){
            ans.addAll(retPath(p+'R',r,c-1));
        }
        return ans;
    }
    static ArrayList<String> retPathDiagonal(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r > 1 && c > 1){
            ans.addAll(retPathDiagonal(p+'D',r-1,c-1));
        }
        if(r > 1){
            ans.addAll(retPathDiagonal(p+'V',r-1,c));
        }
        if(c > 1){
            ans.addAll(retPathDiagonal(p+'H',r,c-1));
        }
        return ans;
    }
    static void pathObs(String p, boolean[][] maze,int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r < maze.length-1){
            pathObs(p+'D',maze,r+1,c);
        }
        if(c < maze[0].length-1){
            pathObs(p+'R',maze,r,c+1);
        }
    }
}
