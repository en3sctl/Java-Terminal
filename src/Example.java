import java.util.Scanner;

public class Example {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            if ((a + b > c) && (b + c > a) && (c + a > b))

                System.out.println("OK");
            else
                System.out.println("NOT OK");

        }
    }

