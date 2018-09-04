package com.designPattern.behavioral.strategy.ex1;

public class OperationalMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1*num2;
    }
}
