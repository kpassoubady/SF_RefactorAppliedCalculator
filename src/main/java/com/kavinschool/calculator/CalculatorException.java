package com.kavinschool.calculator;

public class CalculatorException extends Exception {
    public CalculatorException(String s) {
        super(s);
    }

    public CalculatorException(String s, Exception e) {
        super(s,e);
    }
}
