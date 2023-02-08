package com.DSA;
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
        numbers.removeAt(3);
        numbers.print();
    }
}


