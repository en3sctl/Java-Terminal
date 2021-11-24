import java.util.Scanner;

public class UdemyChallenge5 {
    public static void main(String[] args) {

        int oddSum = 0;
        int evenSum = 0;
        for(int i =1; i<=20; i++){

            System.out.println(i+". number ");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();

            if(num%2==0){
                evenSum = evenSum + num;
            }else{
                oddSum = oddSum + num;
            }
        }
        System.out.println("OddSum: "+oddSum);
        System.out.println("EvenSum: "+evenSum);
    }
}
