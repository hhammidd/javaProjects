package com.designPattern.creational.prototype.ex1;

public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside teh Square:draw method");
    }
}
