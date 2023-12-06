package com.NateAra.Java2.Interface;

public class MainTaxCalculator {

    public static void main(String[] args) {

        var calculator = new TaxCalculator2018(30_000);
        var report = new TaxReport(calculator);
        report.show();
    }
}
