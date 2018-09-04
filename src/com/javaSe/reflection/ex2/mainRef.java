package com.javaSe.reflection.ex2;


import java.lang.reflect.Method;

// reflection API
public class mainRef {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.javaSe.reflection.ex2.Test2");
        Test2 t = (Test2) c.newInstance();

        Method m = c.getDeclaredMethod("show",null);
        m.setAccessible(true);
        m.invoke(t,null);
    }
}
