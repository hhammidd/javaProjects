package com.designPattern.behavioral.strategy.ex1;

public class mainStrategy1 {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10,5));

        context = new Context(new OperationalMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

    }
}
