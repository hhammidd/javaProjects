package com.designPattern.structural.bridge.ex1;

public class mainBridge1 {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100,10,new RedCircle());

        Shape greenCircle = new Circle(100,100,10,new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
