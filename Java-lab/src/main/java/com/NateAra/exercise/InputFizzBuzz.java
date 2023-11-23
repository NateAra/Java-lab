package com.NateAra.exercise;

import java.util.Scanner;

public class InputFizzBuzz {

    private static final int DIVISIBLE_BY_FIVE = 5;
    private static final int DIVISIBLE_BY_THREE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scanner.nextInt();

        if (number % DIVISIBLE_BY_THREE == 0 && number % DIVISIBLE_BY_FIVE == 0) {
            System.out.println("FizzBuzz");
        } else if (number % DIVISIBLE_BY_FIVE == 0) {
            System.out.println("Fizz");
        } else if (number % DIVISIBLE_BY_THREE == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }
}
