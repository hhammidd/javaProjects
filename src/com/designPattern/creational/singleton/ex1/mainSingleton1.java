package com.designPattern.creational.singleton.ex1;

public class mainSingleton1 {
    public static void main(String[] args) {
        // illegal construct
        // complile Time Error: The constructor SingleObject() is not visible
        // SingleObject object = new SingleObject();

        // Get the only object available
        SingleObject object = SingleObject.getInstance();

        // only way you can make an object from SingleObject is making getInstance


        // show the message
        object.showMessage();
    }
}
