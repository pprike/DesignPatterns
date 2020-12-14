package com.designpatterns.creational.singleton;

public class Main {

    public static void main (String [] args) {

        Singleton instance_1 = Singleton.getInstance();
        Singleton instance_2 = Singleton.getInstance();
        Singleton instance_3 = Singleton.getInstance();
        Singleton instance_4 = Singleton.getInstance();

        System.out.println(instance_1);
        System.out.println(instance_2);
        System.out.println(instance_3);
        System.out.println(instance_4);
    }
}