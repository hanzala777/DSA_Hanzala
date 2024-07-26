package com.DSA.LinkedLists;

public class CircularLL {
    private Node head;
    private Node tail;
    public CircularLL(){
        this.head = null;
        this.tail = null;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(head == null){
            tail = node;
            head = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void delete(int val){
        Node temp = head;
        if(temp == null){
            return;
        }
        if(temp.value == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            if(temp.next.value == val){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }while(temp != head);
        System.out.println("Doesn't Exist!");
    }
    public void Display(){
        Node temp = head;
        if (head != null){
            do{
                System.out.print(temp.value + " -> ");
                temp = temp.next;
                if(tail == head){
                    return;
                }
            } while (temp != head);
        }
    }

    private class Node{
        private int value;
        private Node next;
        public Node(int value){ this.value = value; }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
