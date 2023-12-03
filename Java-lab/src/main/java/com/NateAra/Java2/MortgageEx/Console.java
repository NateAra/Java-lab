package com.NateAra.Java2.MortgageEx;

import java.util.Scanner;

public class Console {
    private Scanner scanner;

    public Console() {
        this.scanner = new Scanner(System.in);
    }

    public double getValidatedInput(String prompt, double min, double max, String errorMessage) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
            System.out.print(prompt);
        }
        double userInput = scanner.nextDouble();
        while (userInput < min || userInput > max) {
            System.out.println(errorMessage);
            System.out.print(prompt);
            userInput = scanner.nextDouble();
        }
        return userInput;
    }

    public void close() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
