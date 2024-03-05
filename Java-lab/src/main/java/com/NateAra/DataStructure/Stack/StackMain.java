package com.NateAra.DataStructure.Stack;


public class StackMain {
    public static void main(String[] args) {
        String str = "(e)(t(a))N";

        StackExercise balance = new StackExercise();
        System.out.println(balance.basicBalancedExpression(str));
    }

}
