package com.company;

public class Task_36 {
    //Udemy Challenge
    public static void main(String[] args) {

    }
    public static boolean hasSameLastDigit(int a, int b, int c){
        return isValid(a) && isValid(b) && isValid(c) && (a%10 == b%10 || b%10 == c%10 || c%10 == a%10);
    }
    public static boolean isValid(int num){
        return (num >= 10) && (num <=1000);
    }
}
