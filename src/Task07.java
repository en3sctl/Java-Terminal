import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
         int w = 0;
         int h = 0;
         int a;
         int b;

        System.out.println("Please Enter The Wıde & Heıght: ");
        w = scan.nextInt();
        h = scan.nextInt();

        for(a=1; a<=w; a++){
            for(b=1; b<=h; b++){
                if(a==1 || a==w || b==1 || b==h)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("\n");
        }
    }
}
