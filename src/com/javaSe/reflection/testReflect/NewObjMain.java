package com.javaSe.reflection.testReflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public class NewObjMain {


    public static void main(String[] args) throws Exception {
        TempStruct ts =
                (TempStruct) instantiate(
                        Arrays.asList("373.15", "Kelvin"),
                        TempStruct.class.getName());

        System.out.println(
                ts.getClass().getSimpleName() + " " +
                        ts.tempValue + " " +
                        ts.unitOfMeasurement);


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

    static Object instantiate(List<String> args, String className)
            throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> clazz = Class.forName(className);


        for (Constructor<?> cons : clazz.getConstructors()) {
            Class<?>[] paramTypes = cons.getParameterTypes();

            // if the arity matches, let's use it
            if (args.size() == paramTypes.length) {
                // Convert the String arguments into the parameters' types.
                Object[] convertedArgs = new Object[args.size()];
                for (int i = 0; i < convertedArgs.length; i++) {
                    convertedArgs[i] = convert(paramTypes[i], args.get(i));
                }

                // Instantiate the object with the converted arguments.
                return cons.newInstance(convertedArgs);
            }
        }
        throw new IllegalAccessException("Dont Know How to instantiate: " + className);
    }
}

class TempStruct {
    protected double tempValue;
    protected String unitOfMeasurement;

    public TempStruct(double tempValue, String unitOfMeasurement) {
        this.tempValue = tempValue;
        this.unitOfMeasurement = unitOfMeasurement;
    }
}


