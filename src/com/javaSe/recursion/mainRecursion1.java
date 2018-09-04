package com.javaSe.recursion;

public class mainRecursion1 {
    public static void main(String[] args) {
        System.out.println(fact(3));
    }

    // factorial method Multiple by itself
    public static long fact(long n){
        if (n<= 1)
            return 1;
        else
            return n * fact(n-1);
    }
}
