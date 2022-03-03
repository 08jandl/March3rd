package com.company;

public class GradeSwitch {
    public static void main(String[] args) {
        System.out.println(getGradeText(1));
        System.out.println(getGradeText(2));
        System.out.println(getGradeText(3));
        System.out.println(getGradeText(4));
        System.out.println(getGradeText(5));
    }

    public static String getGradeText(int grade) {
        //enhanced switch;
        return switch (grade) {
            case 1 -> "Outstanding";
            case 2 -> "Excellent";
            case 3 -> "Acceptable";
            case 4 -> "Passing";
            case 5 -> "Fail";
            default -> null;
        };
    }

    public static int getGrade (String gradeText) {
        return switch (gradeText) {
            case "Outstanding" -> 1;
            case "Excellent" -> 2;
            case "Acceptable" -> 3;
            case "Passing" -> 4;
            case "Fail" -> 5;
            default -> 0;
        };
    }
}
