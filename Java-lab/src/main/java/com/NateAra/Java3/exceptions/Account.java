package com.NateAra.Java3.exceptions;

import java.io.IOException;

//TODO have to revise the code

// Throwing Exceptions
public class Account {

    private double balance;

    public void deposit(double value) {
        // This is unchecked exception
        if (value <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public void deposit2(double value) throws IOException {
        // This is checked exception
        if (value <= 0) {
            throw new IOException();
        }
    }

    // Custom Exceptions
    public void withdraw(double value) throws InsufficientFundsException {
        if (value > balance) {
            throw new InsufficientFundsException();
        }
    }
}
