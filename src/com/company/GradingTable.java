package com.company;

public class GradingTable {
    public static void main(String[] args) {
        System.out.println("The grade is " + getGrade(89));
        System.out.println("The grade is " + getGrade(23));
        System.out.println("The grade is " + getGrade(55));
        System.out.println("The grade is " + getGrade(75));
        System.out.println("The grade is " + getGrade(-34));
        System.out.println("The grade is " + getGrade(120));
    }
    //>= 90	Outstanding
    //78 – 89	Excellent
    //65 – 77	Acceptable
    //51 – 64	Passing
    //<= 50	Fail

    public static String getGrade (int points) {
        if (points >= 90) {
            return "Outstanding";
        } else if (points >= 78) {
            return "Excellent";
        } else if (points >= 65) {
            return "Acceptable";
        } else if (points >= 51) {
            return "Passing";
        } else {
            return "Fail";
        }
    }
}
