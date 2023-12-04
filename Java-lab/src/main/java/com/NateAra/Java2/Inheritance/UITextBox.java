package com.NateAra.Java2.Inheritance;

public class UITextBox extends UIControl {

    private String text = "";

    public UITextBox() {
        super(true);
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }

    @Override
    public String  toString() {
        return text;
    }
}
