package com.designPattern.creational.prototype.ex1;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String,Shape> shapeMap = new Hashtable<>();
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }
    //for each shape run db query and create shape
    // shapeMap.put(shapeKey,shape);
    // for example, we are adding two shapes

    public static void loadCache(){
        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        shapeMap.put(rectangle.getId(),rectangle);
    }


}
