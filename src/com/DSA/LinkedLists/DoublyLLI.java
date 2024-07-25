package com.DSA.LinkedLists;

public class DoublyLLI {
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.insertFirst(1);
        dll.insertFirst(2);
        dll.insertFirst(3);
        dll.insertLast(5);
        dll.insertLast(51);
        dll.insertLast(35);
        dll.insertLast(73);
        dll.insertLast(87);
        dll.insert(4,3);
        dll.Display();
        dll.search(73);
    }
}
