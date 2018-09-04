package com.designPattern.behavioral.chainOfResponsibility.ex1;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }
    @Override
    protected void write(String message){
        System.out.println("Error::Loggre " + message);
    }
}
