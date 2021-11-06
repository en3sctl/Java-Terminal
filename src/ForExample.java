
import java.util.Scanner;

public class ForDongusuVs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The Size: ");

        int size = scan.nextInt();

        for(int i = 1; i<=size; i++){
            for(int j = 1; j<=size; j++){
                if(i==j || i+j==size+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}





