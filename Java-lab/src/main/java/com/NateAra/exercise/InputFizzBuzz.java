package com.NateAra.exercise;

import java.util.Scanner;

public class InputFizzBuzz {

    private static final int DIVISIBLE_BY_FIVE = 5;
    private static final int DIVISIBLE_BY_THREE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scanner.nextInt();

        System.out.println(fizzBuzz(number));
    }

    private static String fizzBuzz(int number) {
        String result = "";

        result += (number % DIVISIBLE_BY_THREE == 0) ? "Fizz" : "";
        result += (number % DIVISIBLE_BY_FIVE == 0) ? "Buzz" : "";

        return result.isEmpty() ? String.valueOf(number) : result;
    }
}
