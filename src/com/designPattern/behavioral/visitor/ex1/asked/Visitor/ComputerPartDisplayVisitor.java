package com.designPattern.behavioral.visitor.ex1.asked.Visitor;

import com.designPattern.behavioral.visitor.ex1.asked.computerPart.Computer;
import com.designPattern.behavioral.visitor.ex1.asked.computerPart.Keyboard;
import com.designPattern.behavioral.visitor.ex1.asked.computerPart.Monitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Display computer");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Display Keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Display Monitor");
    }
}
