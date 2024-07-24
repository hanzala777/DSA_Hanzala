package com.DSA.LinkedLists;

public class LLI {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(6);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(4);
        list.insert(1,3);
        list.search(1);
        list.Display();
        System.out.println(list.remove(2));
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        list.Display();
    }
}
