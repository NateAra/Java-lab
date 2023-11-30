package com.NateAra.Java2.encapsulation;

public class Employee {

    private double baseSalary;
    private double hourlyRate;

    public double calculateWage(double extraHours ) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public double setBaseSalary(double baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Base Salary has to be more than 0");
        }
        return this.baseSalary = baseSalary;
    }


    private double getBaseSalary() {
        return baseSalary;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("Hourly Rate has to be more than 0");
        }
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
}
