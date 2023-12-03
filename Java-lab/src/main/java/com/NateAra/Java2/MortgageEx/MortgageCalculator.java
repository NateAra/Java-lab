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
        double monthlyInterestRate = getMonthlyInterestRate();
        double numberOfPayments = getNumberOfPayments();

        return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }



    public double calculateBalance(double numberOfPaymentsMade) {
        double monthlyInterestRate = getMonthlyInterestRate();
        double numberOfPayments = getNumberOfPayments();

        return principal * (Math.pow(1 + monthlyInterestRate, numberOfPayments) - Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }

    public double[] getRemainingBalances() {
        var balances = new double[(int) getNumberOfPayments()];
        for (int month = 1; month <= balances.length; month++) {
            balances[month - 1] = calculateBalance(month);
        }
        return balances;
    }

    private double getMonthlyInterestRate() {
        return annualInterestRate / MONTHS_IN_YEAR / PERCENT;
    }

    private double getNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }
}
