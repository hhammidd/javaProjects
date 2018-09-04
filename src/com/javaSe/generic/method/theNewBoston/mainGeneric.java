package com.javaSe.generic.method.theNewBoston;

public class mainGeneric {
    public static void main(String[] args) {
        Integer[] iray = {1,2,3,4};
        Character[] cary = {'s','d','f','g','h'};

        printMe(iray);
        printMe(cary);
    }

    private static void printMe(Character[] i) {
        for (Character x:i){
            System.out.printf("%s ", x);
            System.out.println();
        }
    }

    private static void printMe(Integer[] i) {
        for (Integer x:i){
            System.out.printf("%s ", x);
            System.out.println();
        }
    }
}
