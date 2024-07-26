package com.DSA.LinkedLists;

public class CircularLLI {
    public static void main(String[] args) {
        CircularLL cll = new CircularLL();
        cll.insertLast(34);
        cll.insertLast(31);
        cll.insertLast(33);
        cll.insertLast(23);
        cll.Display();
        System.out.println();
        cll.delete(23);
        cll.Display();
    }
}
