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
                if (bracesDoNotMatch(right, left)) return false;
            }
        }
        return temp.isEmpty();
    }

    private boolean isLeftBrace(char left) {
        return left == '(' || left == '[' || left == '{' || left == '<';
    }

    private boolean isRightBrace(char right) {
        return right == ')' || right == ']' || right == '}' || right == '>';
    }

    private boolean bracesDoNotMatch(char left, char right) {
        return  (right == ')' && left != '(') ||
                (right == ']' && left != '[') ||
                (right == '}' && left != '{') ||
                (right == '>' && left != '<');
    }

}
