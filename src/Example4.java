import java.io.*;
import java.util.*;

public class Example4 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("================================");

            for(int i = 0; i<3; i++){

                String str = scan.next();
                int a = scan.nextInt();
                System.out.printf("%-15s%03d%n", str, a);
            }
            System.out.println("================================");
        }
}

