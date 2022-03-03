package com.company;

public class Discount2 {
    public static void main(String[] args) {
        //On the bus you receive a discount if you are a senior citizen, a dog or a student.
        boolean isSeniorCitizen = true;
        boolean isDog = false;
        boolean isStudent = true;
        boolean busDiscount;

        busDiscount = getBusDiscount(isSeniorCitizen, isDog, isStudent);

        System.out.println("Discount applied: " + busDiscount);

        //In a bookshop you receive a discount if you buy more than 2 non-fiction books and at least one fiction book.
        int nonFiction = 4;
        int fiction = 3;
        boolean bookDiscount;

//        bookDiscount = getBookDiscount(nonFiction, fiction);
//        bookDiscount = getBookDiscount(1, 5);
        bookDiscount = getBookDiscount(12, 0);
        System.out.println("I get a discount for my books: " + bookDiscount);

        //In a grocery shop you get a discount if you buy one drink, but only if it is not alcoholic.

        boolean drinkDiscount = getDrinksDiscount(2, 7);

        System.out.println("I get a discount for drinks: " + drinkDiscount);
    }


    public static boolean getBusDiscount(boolean senior, boolean dog, boolean student) {
        boolean busDiscount;
        if (senior) {
            busDiscount = true;
        } else if (dog) {
            busDiscount = true;
        } else if (student) {
            busDiscount = true;
        } else {
            busDiscount = false;
        }
        return busDiscount;
    }

    public static boolean getBookDiscount(int nonFiction, int fiction) {
        boolean bookDiscount;
        if (nonFiction > 2 && fiction > 1) {
            bookDiscount = true;
        } else {
            bookDiscount = false;
        }
        return bookDiscount;
    }

    public static boolean getDrinksDiscount(int nonAlcoholic, int alcoholic) {
        boolean drinkDiscount;
        if (nonAlcoholic > 1 && alcoholic == 0) {
            drinkDiscount = true;
        } else {
            drinkDiscount = false;
        }
        return drinkDiscount;
    }
}
