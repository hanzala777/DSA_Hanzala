package com.DSA.LinkedLists;


public class LL {
    private Node head;
    private Node tail;
    private int size;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
        }
        Node node =  new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
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
        for(int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size += 1;
    }
    public int removeFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size -= 1;
        return val;
    }

    public int removeLast(){
        if(size <= 1){
            return removeFirst();
        }
        Node second_last = get(size-2);
        int val = tail.value;
        tail = second_last;
        tail.next = null;
        return val;
    }

    public int remove(int index){
        if(index == 0){
            return removeFirst();
        }
        if(index == size-1){
            return removeLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public Node get(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
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
    public void Display(){
        Node temp = head;
        System.out.print("START -> ");
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END" + "\n");
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
