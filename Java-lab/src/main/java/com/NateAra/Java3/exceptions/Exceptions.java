package com.NateAra.Java3.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

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

}
