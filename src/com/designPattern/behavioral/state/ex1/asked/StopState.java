package com.designPattern.behavioral.state.ex1.asked;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in Stop state.");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
