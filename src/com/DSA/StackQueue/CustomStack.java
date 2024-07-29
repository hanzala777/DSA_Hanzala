package com.DSA.StackQueue;

public class CustomStack {
    int[] data;
    public static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public CustomStack() {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full !!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return data[ptr--];
    }

    public int peek(){
        return data[ptr];
    }
    private boolean isEmpty(){
        return ptr == -1;
    }

    private boolean isFull() {
        return ptr == data.length - 1;
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push(2);
        stack.push(4);
        stack.push(3);
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(3);
        stack.push(5);
        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
    }
}
