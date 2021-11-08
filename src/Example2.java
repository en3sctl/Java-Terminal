import javax.swing.*;
import java.util.Scanner;

public class Example2 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter The Value Of a: ");
            double a = scan.nextDouble();
            System.out.println("Please Enter The Value Of b: ");
            double b = scan.nextDouble();
            System.out.println("Please Enter The Value Of c: ");
            double c = scan.nextDouble();

            double res =  b * b - 4.0 * a * c;

            if(res<0)
                System.out.println("Nothing");
            else
            if (res == 0)
                System.out.println("x= " + (-b / (2 * a)));
            else{
                System.out.println("x1= " + ((-b-Math.sqrt(res))/(2*a))+ "x2= "+(-b-Math.sqrt(res))/(2*a));

                JOptionPane.showMessageDialog(null,res);

            }
        }
}

