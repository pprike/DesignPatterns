package com.designpatterns.creational.prototype;

public class Sandwich extends FoodItem {

    private String breadType;

    private String cheese;

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }
}