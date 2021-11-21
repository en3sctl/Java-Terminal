package com.company;

public class Task_50 {
    //Udemy Challenge
    public static void main(String[] args) {
        canPack(1,0,5);
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        for (int i =0; i<=bigCount; i++){
            for (int j=0; j<=smallCount; j++){
                if ((5*i)+j==goal)
                    return true;
            }
        }
        return false;
    }
}