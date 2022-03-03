package com.company;

public class Rectangle {
    public static void main(String[] args) {
        // declare variables - not initialized - not used yet
        int width;
        int length;

        // declare & initialize circumference by calling the method that calculates the circumference
        int circumference = calculateCircumference(2, 3);
        // See the result of the above  in the console
        System.out.println(circumference);

        // print out a new calculation with new values
        // without declaring and initializing a variable that saves the new circumference
        System.out.println(calculateCircumferenceShort(4, 7));

        // initialize the variable declared on top of the class with values
        width = 9;
        length = 89;
        // calculate the circumference with the variables
        // save the circumference in the variable declared and initialized before
        // -> overwrites what was stored in this variable before
        circumference = calculateCircumference(width, length);
        System.out.println(circumference);
    }

    public static int calculateCircumference(int width, int length) {
        int circumference;
        circumference = 2 * (width + length);
        return circumference;
    }

    public static int calculateCircumferenceShort(int width, int length) {
        return 2 * (width + length);
    }
}
