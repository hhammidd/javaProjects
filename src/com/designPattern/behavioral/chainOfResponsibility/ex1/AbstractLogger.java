package com.designPattern.behavioral.chainOfResponsibility.ex1;

public abstract class AbstractLogger {
    public static int ERROR = 3;
    public static int DEBUG = 2;

    protected int level;
    private AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    abstract protected void write(String message);

    public void logMessage(int level, String message) {
        if (this.level <= level){
            write(message);
        }
        if (nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }
}
