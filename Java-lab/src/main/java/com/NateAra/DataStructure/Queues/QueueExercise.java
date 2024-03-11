package com.NateAra.DataStructure.Queues;

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
        Stack<Integer> re = new Stack<>();

        while (!queue.isEmpty()) {
            re.add(queue.remove());
        }

        while (!re.isEmpty()) {
            queue.add(re.pop());
        }
    }

}
