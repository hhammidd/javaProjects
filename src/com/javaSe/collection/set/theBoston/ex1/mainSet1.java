package com.javaSe.collection.set.theBoston.ex1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class mainSet1 {
    public static void main(String[] args) {
        String[] things = {"here","hamid","giac","hamid","alf"};

        List<String> list = Arrays.asList(things);
        System.out.printf("%s ", list);
        System.out.println();

        // set will cancle duplicate
        Set<String> set = new HashSet<String>(list);
        System.out.printf("%s ",set);
    }
}
