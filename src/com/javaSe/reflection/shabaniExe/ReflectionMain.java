package com.javaSe.reflection.shabaniExe;

import java.lang.reflect.Field;

public class ReflectionMain {



    public Object copy(Object obj){
        Object objNew = new Object();
        //return a copy of Object
        objNew = obj;
        return objNew;
    }

    public Object toObj(String json,Class cls){
        Object objNew = new Object();

    // return an object of type cls filled with json data
    return objNew;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException, ClassNotFoundException {
        ReflectionMain rm = new ReflectionMain();
        Class clazz = Class.forName("com.javaSe.reflection.shabaniExe.model.UserQ1");
        Object objUser = clazz.newInstance();

        Field field1 = clazz.getDeclaredField("id");
        Field field2 = clazz.getDeclaredField("name");
        field1.setAccessible(true);
        field1.set(objUser, 1);
        field2.setAccessible(true);
        field2.set(objUser, "be 2");
        System.out.println("============Initia by Field===========");
        System.out.println("name company by field: "  );

        Object objectNew = rm.copy(objUser);

    }
}
