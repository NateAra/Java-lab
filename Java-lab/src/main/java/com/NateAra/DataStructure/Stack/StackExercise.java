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

        for (char i : str.toCharArray()) {
            if (isOpeningBrace(i)) {
                temp.push(i);
            }

            if (isClosingBrace(i)) {
                if (temp.isEmpty()) return false;
                var open = temp.pop();
                if (
                        (i == ')' && open != '(') ||
                        (i == ']' && open != '[') ||
                        (i == '}' && open != '{') ||
                        (i == '>' && open != '<')
                ) {
                    return false;
                }
            }
        }
        return temp.isEmpty();
    }

    private boolean isOpeningBrace(char i) {
        return i == '(' || i == '[' || i == '{' || i == '<';
    }

    private boolean isClosingBrace(char i) {
        return i == ')' || i == ']' || i == '}' || i == '>';
    }

}
