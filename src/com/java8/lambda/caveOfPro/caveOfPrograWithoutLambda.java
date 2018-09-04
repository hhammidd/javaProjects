package com.java8.lambda.caveOfPro;

interface Executable {
    void execute();
}

class Runner {
    public void run(Executable e){
        System.out.println("Executing code ...");
        e.execute();
    }
}


public class caveOfPrograWithoutLambda {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello there");
            }
        });


        System.out.println("=====================");

        System.out.println("This is code passed in a lambda expression");
        runner.run(() -> {System.out.println("Hello there");

        });
    }
}
