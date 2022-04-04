package com.kodilla.calculator;

public class Calculator {
    public int x;
    public int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int addXToY(int x, int y) {
        return x + y;
    }

    public int subtractYFromX(int x, int y) {
        return x - y;
    }
}
