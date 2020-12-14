package com.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, FoodItem> foodItems;

    public Registry() {
        foodItems = new HashMap<>();
        loadFoodItems();
    }

    public FoodItem createFoodItem(String type) {
        FoodItem foodItem =  null;
        try {
            foodItem = (FoodItem) foodItems.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return foodItem;
    }

    private void loadFoodItems() {
        Pizza pizza = new Pizza();
        pizza.setName("Veg Extraveganza");
        pizza.setCategory("Veg");
        pizza.setBaseType("Thin Crust");
        pizza.setToppings("Corn, Mushrooms");
        pizza.setPrice(449);
        foodItems.put("Pizza", pizza);

        Sandwich sandwich = new Sandwich();
        sandwich.setName("Veg Club");
        sandwich.setCategory("Veg");
        sandwich.setBreadType("Wheat Bread");
        sandwich.setCheese("Mozarella");
        sandwich.setPrice(199);
        foodItems.put("Sandwich", sandwich);
    }
}