package com.NateAra;


public class Main {
    public static void main(String[] args) {

        System.out.println(solution("Nate"));

    }

    public static String solution(String str) {
        // Your code here...
        return new StringBuilder(str).reverse().toString();
    }

}