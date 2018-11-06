package com.javaSe.reflection.testReflect;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectTest {

    private void giveObject(){
        Object person = new Person();
        Field[] fields = person.getClass().getDeclaredFields();

        List<String> actualFieldNames = getFileNames(fields);

        System.out.println("======Fieds Name========");
        for (String o : actualFieldNames){
            System.out.println(o);
        }

    }

    private List<String> getFileNames(Field[] fields) {
        List<String> fieldsName = new ArrayList<>();
        for (Field field : fields) {
            fieldsName.add(field.getName());
        }
            return fieldsName;
    }

    public static void main(String[] args) {
        ObjectTest ot = new ObjectTest();
        ot.giveObject();
    }
}
