package com.DSA.StackQueue;

import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> first;
    private Stack<Integer> second;
    public QueueUsingStacks() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() throws Exception{
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() throws Exception{
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked = second.peek();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
