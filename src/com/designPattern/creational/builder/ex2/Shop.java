package com.designPattern.creational.builder.ex2;

public class Shop {
    public static void main(String[] args) {

        //Phone p = new Phone();
        //Builder pattern

        Phone p = new PhoneBuilder().setOs("IOS").setRam(12).getPhone();

        System.out.println(p);

    }
}
