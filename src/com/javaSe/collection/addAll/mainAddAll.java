package com.javaSe.collection.addAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class mainAddAll {
    public static void main(String[] args) {

        //convert stuff array to list
        String[] stuff = {"app","se","be","sol"};

        List<String> list1 = Arrays.asList(stuff);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("you");
        list2.add("pp");
        list2.add("jj");

        for (String x : list2){
            System.out.printf("%s ",x );
        }

        Collections.addAll(list2, stuff);

        System.out.println();
        for (String x : list2){
            System.out.printf("%s ",x );
        }

        // check if pp is
        System.out.println();
        System.out.println("00000000000");
        System.out.println(Collections.frequency(list2,"pp"));


    }
}
