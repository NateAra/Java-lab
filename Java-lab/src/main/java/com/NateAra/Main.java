package com.NateAra;


public class Main {
    public static void main(String[] args) {

        System.out.println(simpleMultiplication(2));

    }

    public static int simpleMultiplication(int n) {
        return n % 2 == 0 ? n * 8 : n * 9;
    }

}