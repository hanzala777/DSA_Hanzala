package com.DSA.LinkedLists;

public class CycleI {
    public static void main(String[] args) {
        Cycle list = new Cycle();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(3);
        System.out.println(list.hasCycle(list.head));
    }
}
