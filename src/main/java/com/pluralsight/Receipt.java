package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        // 1. Create item name and price variables
        String itemName = "apples";
        double itemPrice = 2.37;

        // 2. Create a quantity variable
        int quantity = 3;

        // 3. Build and print the sentence
        System.out.println("You bought " + quantity + " " + itemName
                + " for $" + (itemPrice * quantity));
    }
}
