package com.NateAra.Java2.encapsulation;

public class EmployeeCon {

    private double baseSalary;
    private double hourlyRate;

    public EmployeeCon(double baseSalary, double hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public double calculateWage(double extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    private void setBaseSalary(double baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Base Salary has to be more than 0");
        }
        this.baseSalary = baseSalary;
    }


    private double getBaseSalary() {
        return baseSalary;
    }

    private double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("Hourly Rate has to be more than 0");
        }
        this.hourlyRate = hourlyRate;
    }
}
