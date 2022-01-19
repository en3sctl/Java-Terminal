package com.company;

public class Task13_01 {

    public static void main(String[] args) {

        int a = 23, r = 121, g = 255, b = 130, color = 0;
        
        // pack four components into one int color
        color |= (a << 24);
        color |= (r << 16);
        color |= (g << 8);
        color |= b;

        System.out.println("a, r, g, b = " + a +
                ", " + r + ", " + g + ", " + b);
        System.out.println("color = " + color);
        a = 0;
        r = 0;
        g = 0;
        b = 0;

        // unpack color to get its four
        // components back in a, r, g, b
        a = (color >> 24) & 255;
        r = (color >> 16) & 255;
        g = (color >> 8) & 255;
        b = color & 255;


        System.out.println("a, r, g, b = " + a +
                ", " + r + ", " + g + ", " + b);

    }
}
