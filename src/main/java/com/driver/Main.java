package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.setName("Harry");
        System.out.println(obj.getName());

        // obj.name; name has private access
    }
}