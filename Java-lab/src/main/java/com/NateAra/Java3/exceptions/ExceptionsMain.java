package com.NateAra.Java3.exceptions;


import java.io.IOException;

public class ExceptionsMain {

    public static void main(String[] args) {
        var exceptions = new Exceptions();
        exceptions.show();
        exceptions.showMultiple();
        exceptions.showMultipleDifferent();

        // Should throw an IllegalArgumentException, if value is less than 0

        var account = new Account();
        account.deposit(1);

        try {
            account.deposit2(-1);
        } catch (IOException e) {
            System.out.println("Logging");
        }

    }
}
