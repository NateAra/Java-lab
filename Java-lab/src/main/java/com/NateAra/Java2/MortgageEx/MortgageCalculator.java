package com.NateAra.Java2.MortgageEx;

public class MortgageCalculator {

    public static final int MONTHS_IN_YEAR = 12;
    public static final int PERCENT = 100;
    private final double principal;
    private final double annualInterestRate;
    private final double years;

    public MortgageCalculator(double principal, double annualInterestRate, double years) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
    }

    public double calculateMortgage() {
        double monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / PERCENT;
        double numberOfPayments = years * MONTHS_IN_YEAR;

        return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }

    public double calculateBalance(double numberOfPaymentsMade) {
        double monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / PERCENT;
        double numberOfPayments = years * MONTHS_IN_YEAR;

        return principal * (Math.pow(1 + monthlyInterestRate, numberOfPayments) - Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }

    public double getYears() {
        return years;
    }
}
