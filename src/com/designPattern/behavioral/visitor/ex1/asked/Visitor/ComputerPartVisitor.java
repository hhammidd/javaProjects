package com.designPattern.behavioral.visitor.ex1.asked.Visitor;

import com.designPattern.behavioral.visitor.ex1.asked.computerPart.Computer;
import com.designPattern.behavioral.visitor.ex1.asked.computerPart.Keyboard;
import com.designPattern.behavioral.visitor.ex1.asked.computerPart.Monitor;

public interface ComputerPartVisitor {
    void visit(Computer computer);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
