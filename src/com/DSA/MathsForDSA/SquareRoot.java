package com.DSA.MathsForDSA;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 40, p = 3;
        System.out.println(squareRoot(n,p));
    }
    public static double squareRoot(int n, int p){
        int s = 0, e = n;
        double root = 0.0;
        while(s <= e){
            int m = s + (e - s) / 2;
            if(m*m == n)
                return m;
            if(m*m > n)
                e = m - 1;
            else
                s = m + 1;
        }
        double inc = 0.1;
        for(int i = 0; i < p; i++){
            while (root * root <= n)
                root += inc;
        root -= inc;
        inc /= 10;
        }
        return root;
    }
}
