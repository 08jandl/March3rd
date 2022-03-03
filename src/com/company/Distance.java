package com.company;

public class Distance {
    public static void main(String[] args) {
        int kilometerValue = 12;

        double miles = kilometerToMiles(kilometerValue);

        System.out.println(kilometerValue + " kilometers are " + miles + " miles.");
        System.out.println(miles + " miles are " + milesToKilometers(miles) + " kilometers.");
    }

    public static double kilometerToMiles(int kilometer) {
        return kilometer/1.609;
    }

    public static double milesToKilometers(double miles) {
        return miles*1.609;
    }
}
