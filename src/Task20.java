package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {        //celsius - fahrenheit

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Degree In Celsius: ");
        double celsius = scan.nextDouble();
        double convertToFahrenheit = 9.0/5 * celsius + 32;

        System.out.println("The Result Is: " + convertToFahrenheit);
    }
}
