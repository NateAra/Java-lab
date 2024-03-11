package com.NateAra.DataStructure.Queues;

import java.util.Queue;
import java.util.Stack;

public class QueueExercise {


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
