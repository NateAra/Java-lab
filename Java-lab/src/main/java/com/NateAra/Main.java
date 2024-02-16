package com.NateAra;

public class Main {
    public static void main(String[] args) {



        System.out.println(remove("Nate"));

    }

    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }

}