import java.util.Scanner;

public class UdemyChallenge7 {
    public static void main(String[] args) {
        System.out.println("Base of Triangle");
        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();

        System.out.println("Height of Triangle ");
        Scanner scan1 = new Scanner(System.in);
        int height = scan1.nextInt();

        areaOfTriangle(base, height);
    }

    public static void areaOfTriangle(int base, int height) {
        int areaOfTriangle = (base * height) / 2;
        System.out.println("Area Of Triangle= " + areaOfTriangle + " With Base= " + base + " And Height= " + height);
    }
}
