package com.NateAra.Java2.Interface;

public class TaxReport {

    private final TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show() {
        var tax = calculator.calculatorTax();
        System.out.println(tax);
    }
}
