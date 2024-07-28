package com.DSA.LinkedLists;

import java.util.List;

public class InsertRec {
    private ListNode head;
    private int size;
    public class ListNode {
        private int value;
        private ListNode next;
        public ListNode(int value){ this.value = value; }
        public ListNode(int value, ListNode next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }
    private ListNode insertRec(int val, int index, ListNode node){
        if(index == 0){
            ListNode temp = new ListNode(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val,  index - 1, node.next);
        return node;
    }
    public void Display(){
        ListNode temp = head;
        System.out.print("START -> ");
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END" + "\n");
    }

    public static void main(String[] args) {
        InsertRec list = new InsertRec();
        list.insertRec(0,0);
        list.insertRec(3,1);
        list.insertRec(5,1);
        list.insertRec(2,1);
        list.insertRec(6,1);
        list.insertRec(8,1);
        list.Display();
        list.insertRec(19,4);
        list.Display();
    }
}