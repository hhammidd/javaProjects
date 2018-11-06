package com.javaSe.reflection.shabaniExe;


import java.lang.reflect.*;
import java.util.Arrays;

class User  {

        private int id_user;
        private String name_user;

    public User() {
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    @Override
    public String toString() {
        return "User{" +
                "id_user=" + id_user +
                ", name_user='" + name_user + '\'' +
                '}';
    }
}

    class Company{

        private int id_company;
        private String name_company;

        public Company() {
        }

        public Company(int id_company, String name_company) {
            this.id_company = id_company;
            this.name_company = name_company;
        }

        public int getId_company() {
            return id_company;
        }

        public void setId_company(int id_company) {
            this.id_company = id_company;
        }

        public String getName_company() {
            return name_company;
        }

        public void setName_company(String name_company) {
            this.name_company = name_company;
        }

        @Override
        public String toString() {
            return "Company{" +
                    "id_company=" + id_company +
                    ", name_company='" + name_company + '\'' +
                    '}';
        }
    }

public class MainReflect{

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {

        Company objCo = new Company();

        Class<?> c = Class.forName("com.javaSe.reflection.shabaniExe.User");
        System.out.println("=========class name========");
        System.out.println(c.getSimpleName());
        // is interface
        System.out.println("=========check interface========");
        System.out.println(c.isInterface());
        // get inheritance
        System.out.println("=========get inheritance========");
        System.out.println(c.getSuperclass());

        // class company
        Class cCom = new Company(1,"be").getClass();

        // All the fields

        System.out.println("\n =========1.Getting All Fields of company========");
        System.out.println("=========Note : should be public========");
        Field[] decFields = cCom.getDeclaredFields();
        System.out.println("decFields : " + Arrays.toString(decFields));

        // constructor
        System.out.println("\n =========1.Gettin All constructor of company========");
        Constructor<?>[] constructors = cCom.getConstructors();
        System.out.println("Cons: " + Arrays.toString(constructors));

        // Methods with inherit
        System.out.println("\n =========1.Getting All Methods of company========");
        Method[] methods = cCom.getMethods();
        System.out.println("Methods: " + Arrays.toString(methods));

        // Method
        System.out.println("\n =========1.Getting All Method with inherited of company========");
        Method[] methodsdeclaredMethod = cCom.getDeclaredMethods();
        System.out.println("methodsdeclaredMethod: " + Arrays.toString(methodsdeclaredMethod));

        // create object of desire method
        Method methodCall = cCom.getDeclaredMethod("setId_company",int.class);

        // invoke the method at the runtime:
        methodCall.invoke(objCo, 19);
        System.out.println("=======get Id Company==========");
        System.out.println("id_ company: " + objCo.getId_company());

        // create object of desired fields
        Field field1 = cCom.getDeclaredField("name_company");
        field1.setAccessible(true);
        field1.set(objCo, "beThink");
        System.out.println("============Initia by Field===========");
        System.out.println("name company by field: " + objCo.getName_company());



    }
}
