package com.DSA.MathsForDSA;

public class Power {
    public static void main(String[] args) {
        int base = 3;
        int power = 6;
        System.out.println(power(base,power));
    }
    public static int power(int n, int power){
        int ans = 1;
        while(power > 0){
            if((power & 1) == 1)
                ans *= n;
            n *= n;
            power = power >> 1;
        }
        return ans;
    }
}
