import java.util.Scanner;
public class UdemyChallenge17 {

    public static void main(String[] args) {

        System.out.println("Number Of Students: ");
        Scanner scan = new Scanner(System.in);
        int students = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= students; i++) {

            System.out.println("Enter " + i + ". student's note: ");
            Scanner scan1 = new Scanner(System.in);
            int note = scan1.nextInt();
            sum = sum + note;
        }
        double averagePoint = average(students, sum);
        System.out.println("Average Point= "+averagePoint);
        String str = grades(averagePoint);
        System.out.println(str);
    }

    public static double average(int s1, int sumOfPoints) {

        double point = (double) sumOfPoints;
        double size = (double) s1;
        double average = point / size;
        return average;
    }

    public static String grades(double point) {

        String situation = "";

        if (point <= 100.0 && point >= 75.0) {
            situation = "Superior Intelligence";
            return situation;

        } else if (point <= 74.0 && point >= 70.0) {
            situation = "Successful";
            return situation;

        } else if (point <= 69.0 && point >= 60.0) {
            situation = "Normal";
            return situation;

        } else {
            situation = "Not Successfull";
            return situation;
        }
    }
}
