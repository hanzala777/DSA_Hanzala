package com.DSA;
import java.util.Scanner;
public class Main {
    //*ARRAY*
    public static void main(String[] args){
        //Syntax: dataType[] variable_name=new dataType[size]
        Scanner sc=new Scanner(System.in);
        int[] number=new int[3];
        //reading an array
        for(int i=0;i<number.length;i++) {
            number[i]=sc.nextInt();
        }
        //printing an array
        for(int i=0;i<number.length;i++) {
            System.out.println(number[i]);
        }
    }
}