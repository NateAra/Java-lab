package com.NateAra.Java2.Inheritance;

public class UIMain {

    public static void main(String[] args) {
        var control = new UITextBox();
        control.disable();
        control.setText("Hello World");
//        System.out.println(control.isEnabled());

        // Comparing Objects
        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);

        System.out.println(point1.equals(point2));
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
    }
}
