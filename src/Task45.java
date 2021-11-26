package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(20, 15));
    }

    public static boolean hasSharedDigit(int number_1, int number_2) {
        if ((number_1 > 99) || (number_1 < 10) || (number_2 > 99) || (number_2 < 10)) {
            return false;
        } else {
            return ((number_1 / 10 == number_2 / 10) || (number_1 / 10 == number_2 % 10) || (number_2 / 10 == number_1 % 10) || (number_1 % 10 == number_2 % 10));
        }
    }
}


