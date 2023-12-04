package com.NateAra.Java2.Inheritance;

public class UIMain {

    public static void main(String[] args) {
        var control = new UITextBox();
        control.disable();
        control.setText("Hello World");
        System.out.println(control.isEnabled());
    }
}
