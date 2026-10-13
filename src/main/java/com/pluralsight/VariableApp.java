package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {
        // Step 1:
        // declare variables here
        String favoriteColor = "Blue";
        int yearStarted = 2026;
        char middleInitial = 'L';
        boolean havePets = false;
        String niceMessage = "Believe in yourself!";

        // then use System.out.println() to display results
        System.out.println("My favorite color is " + favoriteColor);
        System.out.println("I started this class in " + yearStarted);
        System.out.println("My middle initial is " + middleInitial);
        System.out.println("Do I have pets? " + havePets);
        System.out.println(niceMessage);

        // Step 2:
        int daysInWeek = 7;
        double coffeePrice = 4.99;
        char favoriteLetter = 'J';
        boolean isRaining = false;

        // 5. Print all values in complete sentences
        System.out.println("There are " + daysInWeek + " days in a week.");
        System.out.println("The price of coffee is $" + coffeePrice + ".");
        System.out.println("My favorite letter is " + favoriteLetter + ".");
        System.out.println("Is it raining? " + isRaining + ".");
    }
}
