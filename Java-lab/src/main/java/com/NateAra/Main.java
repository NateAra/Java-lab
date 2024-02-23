package com.NateAra;




public class Main {
    public static void main(String[] args) {

        int[] items = {1, 2, 3, 4};

        System.out.println();

    }

    public static Integer basicMath(String op, int v1, int v2)
    {
        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v1 / v2;
            default -> null;
        };
    }

}