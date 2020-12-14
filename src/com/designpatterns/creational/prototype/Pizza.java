package com.designpatterns.creational.prototype;

public class Pizza extends FoodItem {

    private String baseType;

    private String toppings;

    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }
}