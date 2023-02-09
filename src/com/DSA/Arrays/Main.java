package com.DSA.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

//*ARRAY*
    public static void main(String[] args){
        //Syntax: dataType[] variable_name=new dataType[size]
      /*  Scanner sc=new Scanner(System.in);
        int[] number=new int[3];
        //reading an array
       for(int i=0;i<number.length;i++) {
            number[i]=sc.nextInt();
        }
        //printing an array
        for(int i=0;i<number.length;i++) {
            System.out.println(number[i]);
        }
*/

        Array numbers=new Array(4);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.removeAt(1);
        System.out.println(numbers.indexOf(10));
        numbers.print();

/*
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for(int i=0;i<3;i++)
            list.add(new ArrayList<>());
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                list.get(i).add(in.nextInt());
        }
        System.out.println(list);
*/
/*
        Array is the simplest Data Structure
        Static vs Dynamic
        ArrayList
        Runtime complexities:
           lookUp by index --> O(1)
           lookUp by Value, Insert, Delete --> O(n)
         */
    }
}


