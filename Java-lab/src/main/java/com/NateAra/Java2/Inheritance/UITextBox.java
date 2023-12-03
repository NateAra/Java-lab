package com.NateAra.Java2.Inheritance;

public class UITextBox extends UIControl {

    private String text = "";

    private void setText(String text) {
        this.text = text;
    }

    private void clear() {
        this.text = "";
    }
}
