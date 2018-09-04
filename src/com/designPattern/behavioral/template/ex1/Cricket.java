package com.designPattern.behavioral.template.ex1;

public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket game Initialized! Start Playing:");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket game Started. Enjoy the Game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished");
    }
}
