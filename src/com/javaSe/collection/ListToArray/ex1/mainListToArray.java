package com.javaSe.collection.ListToArray.ex1;

import java.util.Arrays;
import java.util.LinkedList;

public class mainListToArray {
    public static void main(String[] args) {
        // we want use method of Arrays or Lists
        String[] stuff = {"babies", "wm","do","ceo"};
        // create a list containing stuff
        LinkedList<String> theList = new LinkedList<String>(Arrays.asList(stuff));

        theList.add("pup");
        theList.addFirst("pup2");

        // convert back to array
        stuff = theList.toArray(new String[theList.size()]);

        for (String x : stuff) {
            System.out.printf("%s ",x);
        }

    }
}
