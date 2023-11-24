package com.NateAra.exercise;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    private static final int MONTHS_IN_YEAR = 12;
    private static final int PERCENT = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal = getValidatedInput(scanner, "Principal: ", 1000, 1000000, "Please enter a value between 1K - 1M");

        double annualInterestRate = getValidatedInput(scanner, "Annual Interest Rate: ", 1, 30, "Please enter a value between 1 - 30");
        double monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / PERCENT;

        double years = getValidatedInput(scanner, "Period (Years): ", 1, 30, "Please enter a value between 1 - 30");
        double numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = calculateMortgage(principal, monthlyInterestRate, numberOfPayments);
        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + mortgageFormat);
    }

    private static double getValidatedInput(Scanner scanner, String prompt, double min, double max, String errorMessage) {
        System.out.print(prompt);
        double input = scanner.nextDouble();
        while (input < min || input > max) {
            System.out.println(errorMessage);
            System.out.print(prompt);
            input = scanner.nextDouble();
        }
        return input;
    }

    private static double calculateMortgage(double principal, double monthlyInterestRate, double numberOfPayments) {
        return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }
}
