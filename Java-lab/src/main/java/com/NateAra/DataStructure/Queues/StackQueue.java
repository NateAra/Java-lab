package com.NateAra.DataStructure.Queues;

import java.util.Stack;

public class StackQueue {

    private final Stack<Integer> stack1;
    private final Stack<Integer> stack2;

    public StackQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void enqueue(int item) {
        stack1.push(item);
    }

    public void dequeue() {
        if (stack1.isEmpty()) throw new IllegalStateException();

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }
    public void dequeue2() {
        if (stack1.isEmpty() && stack2.isEmpty()) throw new IllegalStateException();

        if (stack2.isEmpty())
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        stack2.pop();
    }

    @Override
    public String toString() {
        return stack1.toString();
//        + "\n" + stack2.toString();
    }
}
