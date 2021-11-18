package com.company;
import java.util.HashSet;        // we are finding the same values in the both arrays

public class Main {

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 3, 6, 7, 6, 8, 2, 9};
        int[] brr = {2, 3, 6, 8, 5, 1};

        HashSet<Integer>hashSet = new
                HashSet<Integer>();
        for(int i : arr){
            hashSet.add(i);
        }
        for(int i : brr){
            if(hashSet.contains(i)){
                System.out.println(i+"");
            }
        }
    }
}
