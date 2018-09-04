package com.designPattern.behavioral.visitor.ex1.asked.computerPart;

import com.designPattern.behavioral.visitor.ex1.asked.Visitor.ComputerPartVisitor;

public interface ComputerPart {
     void accept(ComputerPartVisitor computerPartVisitor);
}
