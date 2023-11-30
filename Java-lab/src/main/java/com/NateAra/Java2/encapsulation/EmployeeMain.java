package com.NateAra.Java2.encapsulation;

import java.text.NumberFormat;

public class EmployeeMain {

    public static void main(String[] args) {

        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        double wage = employee.calculateWage(10);
        System.out.println(NumberFormat.getCurrencyInstance().format(wage));

        //Employee with a constructor
        var employeeCon = new EmployeeCon(50_000, 20);
        double wage2 = employeeCon.calculateWage(50);
        System.out.println(NumberFormat.getCurrencyInstance().format(wage2));
    }
}
