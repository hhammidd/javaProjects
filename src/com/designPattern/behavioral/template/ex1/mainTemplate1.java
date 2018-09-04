package com.designPattern.behavioral.template.ex1;

public class mainTemplate1 {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();

    }
}
