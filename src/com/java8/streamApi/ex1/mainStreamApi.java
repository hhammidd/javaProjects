package com.java8.streamApi.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class mainStreamApi {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);

     //   for (int i =0;i<6;i++){
      //      System.out.println(values.get(i));
      //  }

        //2.
     //   Iterator<Integer> i = values.iterator();
       // while (i.hasNext()){
         //   System.out.println(i.next());
//        }

        //3. enhance for loop

            for (int i : values){
                System.out.println(i);
            }
}
}
