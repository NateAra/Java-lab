package com.NateAra.Java3.exceptions;

import java.io.IOException;

// Throwing Exceptions
public class Account {

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
}
