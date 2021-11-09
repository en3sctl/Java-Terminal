import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num, integer, odd = 0, even = 0;
        System.out.println("Please Enter The Integers: ");
        num = scan.nextInt();
        System.out.println("Enter The Integers: ");

        for(int i=0; i<num; i++){
            integer = scan.nextInt();
            if(integer%2==0) {
                even = even + integer;
            }else{
                odd = odd + integer;
            }
            System.out.println("Even Sum-> "+even);
            System.out.println("Odd Sum-> "+odd);
        }
    }
}
