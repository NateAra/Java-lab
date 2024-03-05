package com.NateAra.DataStructure.Stack;


public class StackMain {
    public static void main(String[] args) {
        String str = "[Nate>";

        StackExercise balance = new StackExercise();
        System.out.println(balance.balancedExpression(str));
    }

}
