package com.NateAra.Java2.Inheritance;

public abstract class UIControl {

    private boolean isEnabled;

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public void render() {

    }
}
