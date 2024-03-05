package com.NateAra.DataStructure.Stack;

import java.util.Stack;

public class StackExercise {

    public String reverse(String str) {
        if (str == null) throw new IllegalArgumentException();

        char[] strChar = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char i : strChar) {
            stack.push(i);
        }

        StringBuilder reversed = new StringBuilder();

        while (!stack.empty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
