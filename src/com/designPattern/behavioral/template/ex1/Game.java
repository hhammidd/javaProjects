package com.designPattern.behavioral.template.ex1;

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // template method
    public final void play(){
        // initialize the game
        initialize();

        // start the game
        startPlay();

        //end the game
        endPlay();
    }
}
