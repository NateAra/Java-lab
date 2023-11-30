package com.NateAra.Java2.encapsulation;

public class EmployeeCon {

    private double baseSalary;
    private double hourlyRate;

    public EmployeeCon(double baseSalary, double hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    /**
     * Calculates the wage of the employee including extra hours.
     *
     * @param extraHours the number of extra hours worked.
     * @return the total wage including base salary and payment for extra hours.
     */
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

    private void setHourlyRate(double hourlyRate) {
        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("Hourly Rate has to be more than 0");
        }
        this.hourlyRate = hourlyRate;
    }

    private double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * Overloaded method to calculate wage without extra hours.
     *
     * @return the base salary as the total wage.
     */
    public double calculateWage() {
        return calculateWage(0);
    }
}
