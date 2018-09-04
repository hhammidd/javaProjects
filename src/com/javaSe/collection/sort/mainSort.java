package com.javaSe.collection.sort;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class mainSort {
    public static void main(String[] args) {
        String[] crap = {"app","bac","you","see","ded"};
        List<String> l1 = Arrays.asList(crap);

        Collections.sort(l1);
        System.out.printf("%s\n",l1);

        Collections.sort(l1,Collections.reverseOrder());
        System.out.println();
        System.out.printf("%s\n", l1);
    }
}
