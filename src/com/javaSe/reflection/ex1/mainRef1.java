package com.javaSe.reflection.ex1;

public class mainRef1 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.javaSe.reflection.ex1.Test1");
        Test1 t = (Test1) c.newInstance();
        t.show();
    }
}
