package com.javaSe.collection.list.linkedList.theBoston.ex1;

import java.util.*;

public class mainList1 {
    public static void main(String[] args) {
        String[] things = {"apple","pesce","banana","pasta", "beef"};
        List<String> list1 = new LinkedList<String>();
        for (String x:things){
            list1.add(x);

            String[] things2 = {"banana","sausage","sadegh","sweden"};
            List<String> list2 = new LinkedList<>();
            for (String y : things2){
                list2.add(y);
            }

            list1.addAll(list2);
            list2 = null;

            printMe(list1);
            removeStuff(list1, 2,5);
            printMe(list1);
            reverseMe(list1);
        }

    }

    private static void reverseMe(List<String> list1) {
        ListIterator<String> bobby = list1.listIterator(list1.size());
        while (bobby.hasPrevious()){
            System.out.printf("%s ", bobby.previous());
            System.out.println();
        }
    }

    private static void removeStuff(List<String> list1, int from, int to) {
        list1.subList(from, to).clear();
    }

    private static void printMe(List<String> list1) {
        for (String b : list1){
            System.out.printf("%s ", b);
            System.out.println();
        }
    }
}
