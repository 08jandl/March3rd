package com.company;

public class CountDownWhile {
    public static void main(String[] args) {

        countDown(10);

    }

    public static void countDown (int from) {
        System.out.println("We start with " + from);
        while (from != 0){
            from--;
            System.out.println("Now it's only " + from);
        }
    }
}
