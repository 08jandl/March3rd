package com.company;

public class Switch {
    public static void main(String[] args) {
        System.out.println(getGrade(2));
        System.out.println(getGradeEnhancedSwitch(3));
    }
    public static String getGrade (int numericalGrade) {
        switch (numericalGrade) {
            case 1:
                return "Outstanding";
            case 2:
                return "Excellent";
            case 3:
                return "Acceptable";
            case 4:
                return "Passing";
            default:
                return "Fail";
        }
    }

    public static String getGradeEnhancedSwitch (int numericalGrade) {
        return switch (numericalGrade) {
            case 1 -> "Outstanding";
            case 2 -> "Excellent";
            case 3 -> "Acceptable";
            case 4 -> "Passing";
            default -> "Fail";
        };
    }
}
