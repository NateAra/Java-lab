package com.NateAra.Java3.exceptions;

// This is a custom Exception
// Checked --> Should extend the Exception class
// Unchecked (Runtime) --> should extend RuntimeException
//TODO have to revise the code

public class InsufficientFundsException extends Exception {

    public InsufficientFundsException() {
        super("Insufficient funds in your account.");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
