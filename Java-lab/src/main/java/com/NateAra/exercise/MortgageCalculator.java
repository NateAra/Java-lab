package com.NateAra.exercise;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    private static final int MONTHS_IN_YEAR = 12;
    private static final int PERCENT = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / PERCENT;

        System.out.print("Period (Years): ");
        double year = scanner.nextDouble();
        double numberOfPayments = year * MONTHS_IN_YEAR;

        double mortgage = principal * (rate * Math.pow(1 + rate, period)) / (Math.pow(1 + rate, period) - 1);
        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + result);
    }
}
