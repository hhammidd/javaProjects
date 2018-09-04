package com.designPattern.behavioral.chainOfResponsibility.ex1;

public class mainChain1 {
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLogger();

        loggerChain.logMessage(AbstractLogger.DEBUG,"This is Debug Info");
        loggerChain.logMessage(AbstractLogger.ERROR,"This is Error Info");
    }

    private static AbstractLogger getChainOfLogger() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        return errorLogger;
    }
}
