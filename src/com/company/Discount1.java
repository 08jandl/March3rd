package com.company;

public class Discount1 {
    public static void main(String[] args) {
        //On the bus you receive a discount if you are a senior citizen, a dog or a student.
        boolean isSeniorCitizen = true;
        boolean isDog = false;
        boolean isStudent = true;
        boolean busDiscount;

        if (isSeniorCitizen) {
            busDiscount = true;
        } else if (isStudent) {
            busDiscount = true;
        } else if (isDog) {
            busDiscount = true;
        } else {
            busDiscount = false;
        }

        System.out.println("Discount applied: " + busDiscount);

    //In a bookshop you receive a discount if you buy more than 2 non-fiction books and at least one fiction book.
        int nonFiction = 4;
        int fiction = 3;
        boolean bookDiscount;

        if (nonFiction > 2 && fiction > 1) {
            bookDiscount = true;
        } else {
            bookDiscount = false;
        }

        System.out.println("I get a discount for my books: " + bookDiscount);

    //In a grocery shop you get a discount if you buy one drink, but only if it is not alcoholic.
        int alcoholicDrink = 3;
        int nonAlcoholicDrink = 1;
        boolean drinkDiscount;

        if (nonAlcoholicDrink > 1 && alcoholicDrink == 0) {
            drinkDiscount = true;
        } else {
            drinkDiscount = false;
        }

        System.out.println("I get a discount for drinks: " + drinkDiscount);
    }



}
