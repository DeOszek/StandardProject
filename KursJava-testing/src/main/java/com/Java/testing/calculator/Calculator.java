package com.Java.testing.calculator;

public class Calculator {

    int a;
    int b;
    int c;


    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int add(int a, int b) {
        this.a = a;
        this.b = b;
        return a + b;

    }

    public int subtract(int a, int b) {

        return a - b;

    }

}
