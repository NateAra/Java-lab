package com.NateAra.Java2.MortgageEx;

public class MortgageOOPMain {

    public static void main(String[] args) {
        Console console = new Console();

        double principal = console.getValidatedInput("Principal: ", 1000, 1_000_000, "Please enter a value between 1K - 1M");
        double annualInterestRate = console.getValidatedInput("Annual Interest Rate: ", 1, 30, "Please enter a value between 1 - 30");
        double years = console.getValidatedInput("Period (Years): ", 1, 30, "Please enter a value between 1 - 30");

        var calculator = new MortgageCalculator(principal, annualInterestRate, years);
        var report = new MortgageReport(calculator);

        report.printMortgage();
        report.printPaymentSchedule();

        console.close();
    }
}
