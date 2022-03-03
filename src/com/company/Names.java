package com.company;

public class Names {
    public static void main(String[] args) {
        String firstName = "Ada";
        String lastName = "Lovelace";

        System.out.println(writeFullName(firstName, lastName));
    }

    public static String writeFullName(String firstName, String lastName) {
        return "The full name is " + firstName + " " + lastName + ".";
    }
}
