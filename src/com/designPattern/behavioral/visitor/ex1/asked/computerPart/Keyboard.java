package com.designPattern.behavioral.visitor.ex1.asked.computerPart;

import com.designPattern.behavioral.visitor.ex1.asked.Visitor.ComputerPartVisitor;

public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
