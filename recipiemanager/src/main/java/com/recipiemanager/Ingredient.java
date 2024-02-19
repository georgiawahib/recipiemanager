package com.recipiemanager;

public class Ingredient {
    String name;
    float amount;
    String extraInformation;

    public Ingredient(String name, float amount) {
        this.name = name;
        this.amount = amount;
        this.extraInformation = "";
    }

    public Ingredient(String name, float amount, String extraInformation) {
        this.name = name;
        this.amount = amount;
        this.extraInformation = extraInformation;
    }

    public String getStringIngredient() {
        return amount + name + extraInformation;
    }

    @Override
    public String toString() {
        return amount + " " + name + extraInformation;
    }
}
