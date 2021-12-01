import java.util.Scanner;

public class UdemyChallenge13 {
    public static void main(String[] args) {

        System.out.println("Enter First Number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println("Enter Second Number: ");
        Scanner scan1 = new Scanner(System.in);
        int num1 = scan1.nextInt();

        System.out.println("For Sum Enter 1");
        System.out.println("For Subtraction Enter 2");
        System.out.println("For Multiplication Enter 3");
        System.out.println("For Divide Enter 4");
        Scanner scan2 = new Scanner(System.in);
        int num2 = scan2.nextInt();

        if (num2 == 1) {
            sum(num, num1);
        } else if (num2 == 2) {
            substraction(num, num1);
        } else if (num2 == 3) {
            multiplication(num, num1);
        } else {
            divide(num, num1);
        }
    }

    public static void sum(int s1, int s2) {

        int result = s1 + s2;
        System.out.println("The Result Is: " + result);
    }

    public static void substraction(int s1, int s2) {

        int result = s1 - s2;
        System.out.println("The Result Is: " + result);
    }

    public static void multiplication(int s1, int s2) {

        int result = s1 * s2;
        System.out.println("The Result Is: " + result);
    }

    public static void divide(int s1, int s2) {

        double s1Double = (double) s1;
        double s2Double = (double) s2;
        double result = s1Double / s2Double;
        System.out.println("The Result Is: " + result);
    }
}
