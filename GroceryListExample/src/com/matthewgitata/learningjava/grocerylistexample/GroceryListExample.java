package com.matthewgitata.learningjava.grocerylistexample;

import java.util.ArrayList;
import java.util.Arrays;

public class GroceryListExample {
    public static void main(String[] args) {
        // Create List 1
        ArrayList<String> groceryList1 = new ArrayList<>(Arrays.asList("onions", "tomatoes", "garlic",
                "pepper", "ginger", "coriander"));
        // Create List 2
        ArrayList<String> groceryList2 = new ArrayList<>();
        groceryList2.add("apple");
        groceryList2.add("oranges");
        groceryList2.add("lemons");
        groceryList2.add("melons");
        groceryList2.add("kiwi");
        groceryList2.add("bananas");
        // Add List 2 to List 1
        groceryList1.addAll(groceryList2);
        System.out.println(groceryList1);
        //Search and Remove Item
        if (groceryList1.contains("coriander")) {
            groceryList1.remove("coriander");
            System.out.println(groceryList1);
        }
    }
}