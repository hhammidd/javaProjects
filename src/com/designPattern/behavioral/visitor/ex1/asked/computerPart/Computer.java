package com.designPattern.behavioral.visitor.ex1.asked.computerPart;

import com.designPattern.behavioral.visitor.ex1.asked.Visitor.ComputerPartVisitor;

public class Computer implements ComputerPart{

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[] {new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0 ; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
