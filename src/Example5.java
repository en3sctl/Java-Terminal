import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxNum = 0;
        int maxSum = 0;
        int a = scan.nextInt();

        while(a!=0){

            int sum = 0;
            int tmp = 0;

            while (tmp>10){

                sum += tmp % 10;
                tmp /= a;
            }
            if(maxSum < sum){

                maxSum = sum;
                maxNum = a;
            }
            a = scan.nextInt();
        }
        System.out.println("MAXSUM -> "+maxSum);
        System.out.println("MAXNUM -> "+maxNum);
    }
}
