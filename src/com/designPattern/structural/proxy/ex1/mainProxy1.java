package com.designPattern.structural.proxy.ex1;

public class mainProxy1 {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // image will be loaded from disk
        image.display();
        System.out.println("");

        // image will be loaded from disk
        image.display();
    }
}
