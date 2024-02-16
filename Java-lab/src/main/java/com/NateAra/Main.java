package com.NateAra;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {



    }

    public int squareDigits(int n) {
        String sNum = String.valueOf(n);
        StringBuilder result = new StringBuilder();

        sNum.chars()
                .map(Character::getNumericValue)
                .map(x -> x * x)
                .forEach(result::append);

        return Integer.parseInt(result.toString());
    }

}