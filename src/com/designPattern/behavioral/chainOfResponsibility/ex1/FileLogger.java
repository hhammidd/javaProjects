package com.designPattern.behavioral.chainOfResponsibility.ex1;

public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message){
        System.out.println("File::Loggre " + message);
    }

}
