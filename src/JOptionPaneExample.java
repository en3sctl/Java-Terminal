import javax.swing.*;
import java.util.Scanner;

public class Examples {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter The First Value: ");
            double a = scan.nextDouble();
            System.out.println("Please Enter The Second Value: ");
            double b = scan.nextDouble();
            System.out.println("Please Enter The Third Value: ");
            double c = scan.nextDouble();

            double res = b * b - 4.0 * a * c ;

            if(res<0)
                System.out.println("nothing");
            else
            if(res==0)
                System.out.println("x1 = "+(-b/(2*a)));
            else{
                System.out.println("x2 = "+(-b-Math.sqrt(res)));

                JOptionPane.showMessageDialog(null,res);
            }
        }
    }

