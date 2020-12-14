package com.designpatterns.creational.prototype;

public class Main {

    public static void main (String [] args) {

        Registry registry = new Registry();

        Pizza pizza = (Pizza) registry.createFoodItem("Pizza");
        Sandwich sandwich = (Sandwich) registry.createFoodItem("Sandwich");

        System.out.println(pizza);
        System.out.println(pizza.getName());
        System.out.println(pizza.getCategory());
        System.out.println(pizza.getBaseType());
        System.out.println(pizza.getToppings());
        System.out.println(pizza.getPrice());

        System.out.println("****************************************************************************");

        System.out.println(sandwich);
        System.out.println(sandwich.getName());
        System.out.println(sandwich.getCategory());
        System.out.println(sandwich.getBreadType());
        System.out.println(sandwich.getCheese());
        System.out.println(sandwich.getPrice());

        System.out.println("****************************************************************************");

        Pizza anotherPizza = (Pizza) registry.createFoodItem("Pizza");
        Sandwich anotherSandwich = (Sandwich) registry.createFoodItem("Sandwich");

        anotherPizza.setBaseType("Cheese Burst");
        anotherPizza.setPrice(799);

        anotherSandwich.setCheese("Double Cheese");
        anotherSandwich.setPrice(249);

        System.out.println(anotherPizza);
        System.out.println(anotherPizza.getName());
        System.out.println(anotherPizza.getCategory());
        System.out.println(anotherPizza.getBaseType());
        System.out.println(anotherPizza.getToppings());
        System.out.println(anotherPizza.getPrice());

        System.out.println("****************************************************************************");

        System.out.println(anotherSandwich);
        System.out.println(anotherSandwich.getName());
        System.out.println(anotherSandwich.getCategory());
        System.out.println(anotherSandwich.getBreadType());
        System.out.println(anotherSandwich.getCheese());
        System.out.println(anotherSandwich.getPrice());
    }
}