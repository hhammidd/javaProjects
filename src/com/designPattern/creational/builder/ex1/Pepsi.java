package com.designPattern.creational.builder.ex1;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 29.5f;
    }
}
