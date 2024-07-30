package com.DSA.StackQueue;

public class CustomQueue {
    int[] data;
    public static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }
    public boolean insert(int item){
        if(isFull()){
            System.out.println("Stack is full !!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Stack is Empty !!");
            return -1;
        }
        int item = data[0];
        for(int i = 1; i <= ptr; i++){
            data[i-1] = data[i];
        }
        ptr--;
        return item;
    }
    private boolean isEmpty(){
        return ptr == -1;
    }
    private boolean isFull() {
        return ptr == data.length - 1;
    }
    public void display(){
        if(!isEmpty()){
            for(int i = 0; i <= ptr; i++){
                System.out.print(data[i] + "<-");
            }
            System.out.println("End");
            return;
        }
        System.out.println("Stack is Empty !!");
    }

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(9);
        queue.insert(2);
        queue.insert(45);
        queue.insert(43);
        queue.insert(32);
        queue.display();
        queue.remove();
        queue.remove();
        queue.display();
    }
}
