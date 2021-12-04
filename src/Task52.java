import java.util.Scanner;

public class UdemyChallenge21 {
    public static void main(String[] args) {

        System.out.println("Enter Hour= ");
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();

        System.out.println("Enter Hourly Rate= ");
        Scanner scan1 = new Scanner(System.in);
        int rate = scan1.nextInt();

        salary(hour, rate);
    }

    public static void salary(int hour, int money) {
        int weekly = 0;
        if (hour >= 40) {
            money = ((money * 21) / 100 * money);
            weekly = money * hour;
        } else {
            weekly = money * hour;
        }
        System.out.println("Salary= " + weekly);
    }
}
