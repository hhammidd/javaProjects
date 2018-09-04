package com.javaSe.generic.impGeneric;

public class mainImp {
    public static void main(String[] args) {
        Integer[] iray = {1,2,3,4};
        Character[] cary = {'s','d','f','g','h'};

        printMe(iray);
        printMe(cary);
    }

    // generic method for everything
    public static <T> void printMe(T[] x){
        for (T t: x){
            System.out.printf("%s ", t);
            System.out.println();
        }
    }
}
