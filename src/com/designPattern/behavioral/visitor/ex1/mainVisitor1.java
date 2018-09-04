package com.designPattern.behavioral.visitor.ex1;

import com.designPattern.behavioral.visitor.ex1.asked.Visitor.ComputerPartDisplayVisitor;
import com.designPattern.behavioral.visitor.ex1.asked.computerPart.Computer;
import com.designPattern.behavioral.visitor.ex1.asked.computerPart.ComputerPart;

public class mainVisitor1 {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
