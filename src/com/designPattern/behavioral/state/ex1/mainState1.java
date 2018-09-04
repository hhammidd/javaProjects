package com.designPattern.behavioral.state.ex1;

import com.designPattern.behavioral.state.ex1.asked.Context;
import com.designPattern.behavioral.state.ex1.asked.StartState;
import com.designPattern.behavioral.state.ex1.asked.StopState;

public class mainState1 {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
