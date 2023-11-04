package com.DSA.Recursion;

public class MazeBT {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        pathBT("",board,0,0);
    }
    static void pathBT(String p, boolean[][] maze,int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;

        if(r < maze.length-1){
            pathBT(p+'D',maze,r+1,c);
        }
        if(c < maze[0].length-1){
            pathBT(p+'R',maze,r,c+1);
        }
        if(r > 0){
            pathBT(p+'U',maze,r-1,c);
        }
        if(c > 0){
            pathBT(p+'L',maze,r,c-1);
        }
        //this line where the function is over
        //remove the changes that were made by this function call
        maze[r][c] = true;
    }
}
