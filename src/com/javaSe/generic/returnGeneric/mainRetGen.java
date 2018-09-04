package com.javaSe.generic.returnGeneric;

public class mainRetGen {
    public static void main(String[] args) {
        System.out.println(max(23,41,1));

        // string
        System.out.println(max("aoo","cd","fg"));
    }
    public static <T extends Comparable<T>> T max(T a,T b,T c){
        T m = a;

        if (b.compareTo(a) > 0 )
            m = b;

        if (c.compareTo(m) > 0 )
            m = c;

        return m;
    }
}
