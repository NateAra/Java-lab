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
/*
    This is more efficient,
    but when shouting it does show you straight forward,
    but still does the job in an efficient matter.
*/
    public void dequeue2() {
        if (isEmpty()) throw new IllegalStateException();

        if (stack2.isEmpty())
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        stack2.pop();
    }



    @Override
    public String toString() {
        return stack1 + "\n" + stack2;
    }

    private boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
