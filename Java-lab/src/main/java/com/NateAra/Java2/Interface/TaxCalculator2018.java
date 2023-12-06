package com.NateAra.Java2.Interface;

public class TaxCalculator2018 implements TaxCalculator{

    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculatorTax() {
        return taxableIncome * 0.4;
    }
}
