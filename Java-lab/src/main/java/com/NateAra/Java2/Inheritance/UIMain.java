package com.NateAra.Java2.Inheritance;

import com.NateAra.Java2.Point;
import com.NateAra.Java2.polymorphism.CheckBox;

public class UIMain {

    public static void main(String[] args) {
        var control1 = new UITextBox();
        control1.disable();
        control1.setText("Hello World");
//        System.out.println(control.isEnabled());

        // Comparing Objects
        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);

        System.out.println(point1.equals(point2));
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());

        // Polymorphism: Many Forms
        UIControl[] controls = {new UITextBox(), new CheckBox()};
        for (var control : controls) {
            control.render();
        }
    }
}
