package com.company;

public class Temperature {
    public static void main(String[] args) {
        double currentTemperatureCelsius = -15d;

        double fahrenheit = celsiusToFahrenheit(currentTemperatureCelsius);

        System.out.println(currentTemperatureCelsius + " degrees celsius are " + fahrenheit + " degrees fahrenheit.");
        System.out.println(fahrenheit + " degrees fahrenheit are " + fahrenheitToCelsius(fahrenheit) + " degrees celsius.");
    }


    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
