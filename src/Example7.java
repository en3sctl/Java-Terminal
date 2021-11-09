import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Positive Value: ");
        int a = scan.nextInt();

        if(a%10==0) {
            System.out.println("This Number Is Dividing 10 Correctly ");
        }else{
            System.out.println("This Number Is Not Dividing 10 Correctly ");

        }
    }
}
