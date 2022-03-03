package com.company;

public class Numbers {
    public static void main(String[] args) {

        // even or odd?
        int firstNumber = 14;
        int secondNumber = 2;

        int result = firstNumber % secondNumber;

        if (result == 0 ) {
            System.out.println("The number is even");
        } else System.out.println("The number is odd");


        // divisible by 3?

        int numberOne = 269876;
        int numberTwo = 3;
        int resultDivisible = numberOne % numberTwo;

        if (resultDivisible == 0) {
            System.out.println("This number is divisible by 3:" + numberOne);
        } else System.out.println("This number is not divisible by 3:" + numberOne);

    }
}
