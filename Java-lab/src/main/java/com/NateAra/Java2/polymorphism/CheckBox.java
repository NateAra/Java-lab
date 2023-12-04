package com.NateAra.Java2.polymorphism;

import com.NateAra.Java2.Inheritance.UIControl;

public class CheckBox extends UIControl {

    public CheckBox() {
        super(true);
    }

    @Override
    public void render() {
        System.out.println("Rendering CheckBox");
    }
}
