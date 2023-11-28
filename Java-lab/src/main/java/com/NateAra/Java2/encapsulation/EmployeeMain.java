package com.NateAra.Java2.encapsulation;

import java.text.NumberFormat;

public class EmployeeMain {

    public static void main(String[] args) {

        var employee = new Employee();
        employee.baseSalary = 50_000;
        employee.hourlyRate = 20;
        double wage = employee.calculateWage(10);

        System.out.println(NumberFormat.getCurrencyInstance().format(wage));
    }
}