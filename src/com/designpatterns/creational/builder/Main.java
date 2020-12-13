package com.designpatterns.creational.builder;

public class Main {

    public static void main (String [] args) {

        Burger.Builder burgerBuilder = new Burger.Builder();
        Burger burger = burgerBuilder.bread("Wheat").cheese("Mozarella").isGrilled(true).build();

        System.out.println(burger);
    }
}