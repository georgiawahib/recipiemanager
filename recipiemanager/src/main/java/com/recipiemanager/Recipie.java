package com.recipiemanager;

import java.util.ArrayList;

public class Recipie {
    ArrayList<Ingredient> ingredients;
    ArrayList<String> instructions;
    int servings;
    int timeTaken;
    String name;
    Rating ratings;

    public Recipie(String name, ArrayList<Ingredient> ingredients, ArrayList<String> instructions, int servings,
            int timeTaken) {
        this.ratings = new Rating();
        this.name = name;
        this.ingredients = ingredients;
        this.timeTaken = timeTaken;
        this.servings = servings;
        this.instructions = instructions;
    }

    public void addReview(Review review) throws Exception {
        try {
            this.ratings.addReview(review);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void addIngredients(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public void addInstructions(String instruction) {
        this.instructions.add(instruction);
    }

    public void printRecipie() {
        System.out.println("Recipie for: " + this.name);
        System.out.println("Serves: " + this.servings);
        System.out.println("Time to prepare: " + this.timeTaken);
        System.out.println("Ingredients:");
        for (int i = 0; i < ingredients.size(); i++) {
            System.out.println("\t" + ingredients.get(i));
        }
        System.out.println("Instructions:");
        for (int i = 0; i < instructions.size(); i++) {
            System.out.println("\t" + instructions.get(i));
        }

        System.out.println("Average Ratings: " + ratings.getAverageStars());
        ratings.printAllReviews();
    }

}