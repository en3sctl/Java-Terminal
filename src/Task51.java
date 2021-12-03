import java.util.Scanner;

public class UdemyChallenge18 {
    public static void main(String[] args) {

        System.out.println("Enter First Number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println("Enter Second Number: ");
        Scanner scan1 = new Scanner(System.in);
        int num1 = scan1.nextInt();

        System.out.println("Enter Third Number: ");
        Scanner scan2 = new Scanner(System.in);
        int num2 = scan2.nextInt();

        arrangement(num,num1,num2);

    }

    public static void arrangement(int s1, int s2, int s3) {

        if (s1 > s2) {
            if (s1 > s3) {
                if (s2 > s3) {
                    System.out.println(s1 + ">" + s2 + ">" + s3);
                } else {
                    System.out.println(s1 + ">" + s3 + ">" + s2);
                }
            } else {
                System.out.println(s3 + ">" + s1 + ">" + s2);
            }
        } else {
            if(s2>s3){
                if(s1>s3){
                    System.out.println(s2+">"+s1+">"+s3);
                }else{
                    System.out.println(s2+">"+s3+">"+s1);
                }
            }else{
                System.out.println(s3+">"+s2+">"+s1);
            }
        }
    }
}
