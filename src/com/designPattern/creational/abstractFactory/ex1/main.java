package com.designPattern.creational.abstractFactory.ex1;

import com.designPattern.creational.factory.ex1.ShapeFactory;

public class main {
    public static void main(String[] args) {
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        //get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        // call draw method of Shape Circle
        shape1.draw();

        //get an object of shape Rectangle
        Shape shape2 = shapeFactory.getShape("SQUARE");
        //2d Factory Color
        shape2.draw();


        //get an object of Color Red
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        //call fill method of Red
        Color color1 = colorFactory.getColor("RED");
        // call fill method of Red
        color1.fill();

        Color color2 = colorFactory.getColor("GREEN");
        color2.fill();


    }
}
