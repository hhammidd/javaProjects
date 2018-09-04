package com.designPattern.behavioral.template.ex1;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Footbal Init");
    }

    @Override
    void startPlay() {
        System.out.println("Football start");
    }

    @Override
    void endPlay() {
        System.out.println("Footbal End");
    }
}
