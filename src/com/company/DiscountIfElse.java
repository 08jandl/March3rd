package com.company;

public class DiscountIfElse {
    public static void main(String[] args) {
        //On the bus you receive a discount if you are a senior citizen, a dog or a student.
        boolean isDog = false;
        boolean isSenior = true;
        boolean iStudent = true;
        double ticketPrice = 2.5;
        double discount = getBusDiscount(ticketPrice, isDog, isSenior, iStudent);

        System.out.println("I saved " + discount + "€ for my " + ticketPrice + "€ ticket.");

        //____________________

        int nonFiction = 2;
        int fiction = 3;
        boolean discountBooks = getBookDiscount(fiction, nonFiction);
        System.out.println(discountBooks);


    }

    public static boolean getBookDiscount(int fiction, int nonFiction) {
        boolean discount;
        if (nonFiction > 2 && fiction >=1) {
            discount = true;
        } else {
            discount = false;
        }
        return discount;
    }

    public static double getBusDiscount(double ticketPrice, boolean isDog, boolean isSenior, boolean isStudent) {
        double discount;
        if (isDog) {
            discount = ticketPrice * 0.2;
        } else if (isSenior) {
            discount = ticketPrice * 0.15;
        } else if (isStudent) {
            discount = ticketPrice * 0.1;
        } else {
            discount = 0;
        }
        return discount;
    }
}
