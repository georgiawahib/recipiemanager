package com.recipiemanager;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Ingredient apple = new Ingredient("apples", 2);
        Ingredient pear = new Ingredient("pears, finely chopped", 2);
        ArrayList<Ingredient> myIngredients = new ArrayList<Ingredient>(Arrays.asList(apple, pear));

        String instruction1 = "I eat the apple";
        String instruction2 = "I eat the pear";
        String instruction3 = "profit";
        ArrayList<String> instructions = new ArrayList<String>(Arrays.asList(instruction1, instruction2, instruction3));

        Recipie myRecipie = new Recipie("Apples and Pears", myIngredients, instructions, 1, 40);
        myRecipie.printRecipie();
    }
}
