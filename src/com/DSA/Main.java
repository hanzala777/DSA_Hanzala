package com.DSA;

import java.util.ArrayList;

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
/*
        Array numbers=new Array(4);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.removeAt(1);
        System.out.println(numbers.indexOf(10));
        numbers.print();
*/
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.get(2));
        System.out.println(list);
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


