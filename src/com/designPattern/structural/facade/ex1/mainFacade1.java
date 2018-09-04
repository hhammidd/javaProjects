package com.designPattern.structural.facade.ex1;

public class mainFacade1 {
    public static void main(String[] args) {
       ShapeMaker shapeMaker = new ShapeMaker();

       shapeMaker.drawCircle();

       shapeMaker.drawSquare();
    }
}
