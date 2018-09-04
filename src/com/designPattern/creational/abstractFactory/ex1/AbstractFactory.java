package com.designPattern.creational.abstractFactory.ex1;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
