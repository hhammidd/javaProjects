package com.designPattern.behavioral.mediator.ex1;

public class mainMediator1 {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User jon = new User("John");

        robert.sendMessage("Hi! John");
        jon.sendMessage("Hello! rob! ");
    }
}
