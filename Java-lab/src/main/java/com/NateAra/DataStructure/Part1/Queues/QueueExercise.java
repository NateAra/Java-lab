package com.NateAra.DataStructure.Part1.Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueExercise {

    public static void main(String[] args) {

        Queue<Integer> num = new ArrayDeque<>();
        num.add(10);
        num.add(20);
        num.add(30);
        System.out.println(num);

        reverse(num);
        System.out.println(num);
    }

    public static void reverse(Queue<Integer> queue) {
        // ToDo - Using Only (Add, remove, IsEmpty)
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

}
