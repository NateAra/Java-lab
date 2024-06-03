package com.NateAra;

public class Main {
    public static void main(String[] args) {
        String word = "Hello World";
        System.out.println(lengthOfLastWord(word));

    }

    public static int lengthOfLastWord(String s) {
        String str[] = s.split(" ");
        return str[str.length - 1].length();
    }

}