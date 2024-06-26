package com.NateAra.DataStructure.Part1.Stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

// ToDo == Using Stack
// Reverse string
// Basic Balanced Expression " '(', ')' "
// Advance Balanced Expression " '(', '[', '{', '<', ')', ']', '}', '>' "

public class StackExercise {

    private final List<Character> leftBraces = Arrays.asList('(', '[', '{', '<');
    private final List<Character> rightBraces = Arrays.asList(')', ']', '}', '>');

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

    public boolean basicBalancedExpression(String str) {
        char[] strArr = str.toCharArray();
        Stack<Character> temp = new Stack<>();

        for (char i : strArr) {
            if (i == '(') {
                temp.push(i);
            } else if (i == ')') {
                if (temp.isEmpty()) {
                    return false;
                } else {
                    temp.pop();
                }
            }
        }

        return temp.isEmpty();
    }

    public boolean balancedExpression(String str) {
        Stack<Character> temp = new Stack<>();

        for (char left : str.toCharArray()) {
            if (isLeftBrace(left)) temp.push(left);

            if (isRightBrace(left)) {
                if (temp.isEmpty()) return false;
                var right = temp.pop();
                if (!bracesMatch(right, left)) return false;
            }
        }
        return temp.isEmpty();
    }

    private boolean isLeftBrace(char left) {
        return leftBraces.contains(left);
    }

    private boolean isRightBrace(char right) {
        return rightBraces.contains(right);
    }

    private boolean bracesMatch(char left, char right) {
        return leftBraces.indexOf(left) == rightBraces.indexOf(right);
    }

}
