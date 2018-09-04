package com.designPattern.creational.abstractFactory.ex1;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if (color==null){
            return null;
        }

        if (color.equalsIgnoreCase("RED")){
            return new Red();
        }else if (color.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
