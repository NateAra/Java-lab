package com.NateAra;

public class Main {
    public static void main(String[] args) {

        System.out.println(squareDigits(9119));

    }

    public static int squareDigits(int n) {
        String sNum = String.valueOf(n);
        StringBuilder result = new StringBuilder();
        sNum.chars()
                .map(Character::getNumericValue)
                .map(x -> x * x)
                .forEach(result::append);
        return Integer.parseInt(result.toString());
    }

}