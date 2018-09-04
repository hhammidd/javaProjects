package com.designPattern.creational.singleton.ex1;

public class SingleObject {
    // create an object of singleObject
    private static SingleObject instance = new SingleObject();

    // make the constructor private so that this class cannot be instantiated
    private SingleObject(){}

    // Get the only object availabkle
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World...");
    }
}
