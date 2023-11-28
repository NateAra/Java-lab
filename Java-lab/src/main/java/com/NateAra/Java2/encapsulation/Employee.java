package com.NateAra.Java2.encapsulation;

public class Employee {

    public double baseSalary;
    public double hourlyRate;

    public double calculateWage(double extraHours ) {
        return baseSalary + (hourlyRate * extraHours);
    }
}
