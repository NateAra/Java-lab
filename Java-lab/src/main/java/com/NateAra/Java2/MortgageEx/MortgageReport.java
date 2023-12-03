package com.NateAra.Java2.MortgageEx;

import java.text.NumberFormat;

public class MortgageReport {

    private final MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String monthlyPayments = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("Mortgage");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + monthlyPayments);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("Payment Schedule");
        System.out.println("----------------");

        for (double balance : calculator.getRemainingBalances()) {
            System.out.println(currencyInstance.format(balance));
        }
    }
}
