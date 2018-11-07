package com.javaSe.reflection.testReflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewObjMain {


    public static void main(String[] args) throws Exception {
        TempStruct ts =
                (TempStruct) instantiate(
                        Arrays.asList("373.15", "Kelvin"),
                        TempStruct.class.getName());
        System.out.println("\n ======Test instance=======");
        System.out.println(ts.toString());

        Person p = (Person) instantiate(
                        Arrays.asList("hamid", "2"),
                        Person.class.getName());
        System.out.println("\n ====Person to String=====");
        System.out.println(p.toString());


        // Q1
        TempStruct tsQ1 = (TempStruct) copy(TempStruct.class);
        System.out.println("\n ======String Question1=========");
        System.out.println(tsQ1.toString());

        // Q2
        String jsonString = "here";

        TempStruct tempStruct = new TempStruct();
        String className = TempStruct.class.getName();
        Class<?> clazz = Class.forName(className);
        // return an object of type cls filled with json data
        TempStruct tsQ2 = toObj(jsonString,clazz);
        System.out.println("\n ====To String Question2 ========");
        System.out.println(tsQ2.toString());

        // Q3 example 1 : Object TempStrut
        String tsQ3 = (String) toJson(TempStruct.class);
        System.out.println("\n ======Q3 toString of the object=====");
        System.out.println(tsQ3);



        }
    public static String toJson(Object obj) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        List<String> args = new ArrayList<>();
        // you have to make the Obj Here
        args = Arrays.asList("223.15", "hamidCopy");

        // make new Instance
        Object objNew = makeInstance((Class<?>) obj, args);

        String jsonOfObj = objNew.toString();
        // return json format of obj
        return jsonOfObj;
    }

    private static <T> T toObj(String jsonString, Class<?> clazz)
            throws IllegalAccessException,
            InstantiationException,
            InvocationTargetException {
        List<String> args = new ArrayList<>();
        // you have to make the Obj Here
        args = Arrays.asList("223.15", "hamidCopy");
        Object objNew = makeInstance(clazz, args);

        // return an object of type cls filled with json data
        return (T) objNew;
    }



    static Object convert(Class<?> target, String s) {
        if (target == Object.class || target == String.class || s == null) {
            return s;
        }
        if (target == Character.class || target == char.class) {
            return s.charAt(0);
        }
        if (target == Byte.class || target == byte.class) {
            return Byte.parseByte(s);
        }
        if (target == Short.class || target == short.class) {
            return Short.parseShort(s);
        }
        if (target == Integer.class || target == int.class) {
            return Integer.parseInt(s);
        }
        if (target == Long.class || target == long.class) {
            return Long.parseLong(s);
        }
        if (target == Float.class || target == float.class) {
            return Float.parseFloat(s);
        }
        if (target == Double.class || target == double.class) {
            return Double.parseDouble(s);
        }
        if (target == Boolean.class || target == boolean.class) {
            return Boolean.parseBoolean(s);
        }
        throw new IllegalArgumentException("do not know how to convert to: " + target);
    }

    // Q1
    static Object copy(Object obj) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        List<String> args = new ArrayList<>();
        // you have to make the Obj Here
        args = Arrays.asList("223.15", "hamidCopy");

        // make new Instance
        Object objNew = makeInstance((Class<?>) obj, args);
        return objNew;
    }

    private static Object makeInstance(Class<?> c, List<String> args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        for (Constructor<?> cons : c.getConstructors()){
            Class<?>[] paramTypes = cons.getParameterTypes();
            if (args.size() == paramTypes.length) {
                Object[] convertedArgs = new Object[args.size()];
                for (int i = 0; i < convertedArgs.length; i++) {
                    convertedArgs[i] = convert(paramTypes[i], args.get(i));
                }
                // Instantiate the object with the converted arguments.
                // return a copy of Object
                return cons.newInstance(convertedArgs);
            }
        }
        throw new IllegalAccessException("Dont Know How to instantiate: ");
    }

    static Object instantiate(List<String> args, String className)
            throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> clazz = Class.forName(className);
        Object objNew = makeInstance(clazz,args);
        return objNew;
    }
}

class TempStruct {
    protected double tempValue;
    protected String unitOfMeasurement;

    public TempStruct() {
    }

    public TempStruct(double tempValue, String unitOfMeasurement) {
        this.tempValue = tempValue;
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public double getTempValue() {
        return tempValue;
    }

    public void setTempValue(double tempValue) {
        this.tempValue = tempValue;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    @Override
    public String toString() {
        return "TempStruct{" +
                "tempValue=" + tempValue +
                ", unitOfMeasurement='" + unitOfMeasurement + '\'' +
                '}';
    }
}


