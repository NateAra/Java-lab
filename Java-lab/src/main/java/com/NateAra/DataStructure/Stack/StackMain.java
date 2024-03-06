package com.NateAra.DataStructure.Stack;


public class StackMain {
    public static void main(String[] args) {

        MyStack num = new MyStack();
        num.push(10);
        num.push(20);
        num.push(40);
        num.push(50);
        num.pop();
        System.out.println(num);
        System.out.println(num.peek());
        System.out.println(num.isEmpty());
    }

}
