import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Some Value -> ");

        int total = scan.nextInt();
        int max = total;
        int min = total;

        while(total!=0){

            if(total<min)
                min = total;
            if(total>max)
                max = total;

            total = scan.nextInt();
        }
        System.out.println("MAX: "+max);
        System.out.println("MIN: "+min);
    }
}
