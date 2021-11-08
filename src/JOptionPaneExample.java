import javax.swing.*;
import java.util.Scanner;

public class Examples {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Please Enter The Weight: ");
            double height = scan.nextDouble();
            System.out.println("Please Enter The Height: ");
            double weight = scan.nextDouble();

            double BMI = weight / (height*height);
            System.out.println("The BMI Is: "+BMI+"kg/m2");

            JOptionPane.showMessageDialog(null,"BMI "+BMI);

        }
    }

