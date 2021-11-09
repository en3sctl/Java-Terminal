import java.util.Scanner;

public class Example10 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your first number: ");
            int numberFirst = scan.nextInt();
            Scanner in = new Scanner(System.in);
            System.out.print("Enter your second number: ");
            int numberSecond = in.nextInt();
            Scanner inn = new Scanner(System.in);
            System.out.print("Enter your third number: ");
            int numberThird = inn.nextInt();

            System.out.println(numberFirst + " " + numberSecond + " " + numberThird);

            if (numberFirst >= numberSecond && numberFirst >= numberThird) {
                if (numberSecond >= numberThird) {
                    System.out.println("First number is:" + numberFirst);
                    System.out.println("Second number is:" + numberSecond);
                    System.out.println("Third number is:" + numberThird);
                } else {
                    System.out.println("First number is:" + numberFirst);
                    System.out.println("Second number is:" + numberThird);
                    System.out.println("Third number is:" + numberSecond);
                }

            }
            if (numberSecond >= numberFirst && numberSecond >= numberThird) {
                if (numberFirst >= numberThird) {
                    System.out.println("First number is:" + numberSecond);
                    System.out.println("Second number is:" + numberFirst);
                    System.out.println("Third number is:" + numberThird);
                } else {
                    System.out.println("First number is:" + numberSecond);
                    System.out.println("Second number is:" + numberThird);
                    System.out.println("Third number is:" + numberFirst);
                }
            }
            if (numberThird >= numberSecond && numberThird >= numberFirst) {
                if (numberSecond >= numberFirst) {
                    System.out.println("First number is:" + numberThird);
                    System.out.println("Second number is:" + numberSecond);
                    System.out.println("Third number is:" + numberFirst);
                } else {
                    System.out.println("First number is:" + numberThird);
                    System.out.println("Second number is:" + numberFirst);
                    System.out.println("Third number is:" + numberSecond);
                }
            }
        }
    }
