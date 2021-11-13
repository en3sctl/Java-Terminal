import java.io.*;
import java.util.*;

public class Examplee {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int t = scan.nextInt();

            for(int i = 0; i<t; i++){

                int a = scan.nextInt();
                int b = scan.nextInt();
                int n = scan.nextInt();
                int c = a;

                for(int j = 0; j<n; j++){

                    c += Math.pow(2,j)*b;
                    System.out.printf("%s ", c);
                }
                System.out.println();
            }
            scan.close();
        }
   }
