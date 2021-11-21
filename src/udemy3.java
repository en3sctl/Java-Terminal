package com.company;

public class Task_46 {
    //Udemy challange
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
    }

    public static int getGreatestCommonDivisor(int first, int second)
    {
        if (first < 10 || second < 10)
        {
            return -1;
        }
        while (second != 0)
        {
            if (first > second)
                first -= second;
            else
                second -= first;
        }
        return first;
    }
}