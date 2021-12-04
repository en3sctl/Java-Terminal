import java.util.Random;
import java.util.Scanner;
public class UdemyChallenge22 {
    public static void main(String[] args) {

        //GUESSING GAME//

        Random rnd = new Random();
        int num = rnd.nextInt(50)+1; //[1-100]
        int due = 5;

        while (due>0){
            System.out.println("Take A Guess " +due+" due have");
            Scanner scan = new Scanner(System.in);
            int guess = scan.nextInt();

            if(guess==num){
                System.out.println("Congrats, You Find It");
                break;
            }else if(num>guess){
                System.out.println("Enter More Bigger Number");
                due = due - 1;

            }else{
                System.out.println("Enter More Smaller Number");
                due = due - 1;
            }
        }
    }
}
