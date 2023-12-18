package com.NateAra.Java3.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Exceptions {
    public void show() {
        try {
            var reader = new FileReader("file.txt");
            System.out.println("File Opened");
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist.");
            System.out.println(ex.getMessage());
        }
    }

    public void showMultiple() {
        // Added finally for closing the reader
        FileReader reader = null;

        try {
            reader = new FileReader("file.txt");
            var value = reader.read();
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist.");
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println("IOException");
            ex.getMessage();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }
        }
    }

    public void showMultipleDifferent() {
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
        } catch (IOException | ParseException ex) {
            System.out.println("IOException");
            ex.getMessage();
        }
    }
}
