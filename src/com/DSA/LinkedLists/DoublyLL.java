package com.DSA.LinkedLists;

public class DoublyLL {
    private Node head;
    private Node tail;
    private int size;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(size != 0){
            head.prev = node;
        }
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
        }
        Node node = new Node(val);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }
    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next, temp);
        temp.next = node;

        size += 1;
    }
    public Node search(int value){
        Node node = head;
        int index = 0;
        while(node != null){
            if(node.value == value){
                System.out.println("Found at index " + index);
                return node;
            }
            node = node.next;
            index += 1;
        }
        System.out.println("Not found");
        return null;
    }
    public Node get(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        System.out.println(node.value);
        return node;
    }
    public void Display(){
        Node temp = head;
        System.out.print("START <--> ");
        while (temp != null){
            System.out.print(temp.value + " <--> ");
            temp = temp.next;
        }
        System.out.print("END" + "\n");
    }
    private class Node{
        private int value;
        private Node next;
        private Node prev;
        private Node(int value){
            this.value = value;
        }
        private Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }
}
