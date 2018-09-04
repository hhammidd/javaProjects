package com.designPattern.behavioral.observer.ex1;

public class OctaObserver extends Observer {
    public OctaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octa here: " + Integer.toOctalString(subject.getState()));
    }
}
