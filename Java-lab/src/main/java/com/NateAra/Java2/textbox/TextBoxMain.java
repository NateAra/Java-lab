package com.NateAra.Java2.textbox;

public class TextBoxMain {

    public static void main(String[] args) {

        var textBox1 = new TextBox();
        textBox1.setText("Hello World!");
        System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new TextBox();
        textBox2.setText("Hey Nate!");
        System.out.println(textBox2.text.toUpperCase());

        textBox1.setText("This should not show up");
        textBox1.clear();
        System.out.println(textBox1.text);
    }
}
