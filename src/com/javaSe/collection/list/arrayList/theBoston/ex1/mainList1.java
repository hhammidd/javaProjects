package com.javaSe.collection.list.arrayList.theBoston.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class mainList1 {
    public static void main(String[] args) {
        String[] things = {"ham","rob","gia","fra"};
        List<String> list1 = new ArrayList<>();

        // add array items to list
        for (String x :things){
            list1.add(x);
        }

        String[] morethings = {"ham" , "peg"};
        List<String> list2 = new ArrayList<>();

        // add array items to list
        for (String y :morethings){
            list2.add(y);
        }

        // print the list 1
        for (int i =0;i<list1.size();i++){
            System.out.printf(i+" %s\n", list1.get(i));
        }


        // this is the method
        System.out.println("=======remove exist data from list 2===========");
        editlist(list1,list2);

        // print the list 1
        for (int i =0;i<list1.size();i++){
            System.out.printf(i+" %s\n", list1.get(i));
        }

    }

    // if exist remove from list no one
    private static void editlist(Collection<String> list1, Collection<String> list2) {
        Iterator<String> it = list1.iterator();
        while (it.hasNext()){
            if (list2.contains(it.next()))
                it.remove();
        }
    }
}
