import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The Visa Point: ");
        int studentVisa = scan.nextInt();
        System.out.println("Please Enter The Final Point: ");
        int studentFinal = scan.nextInt();
        System.out.println("Please Enter The Project Point: ");
        int studentProject = scan.nextInt();

        studentVisa = (studentVisa*35)/100;
        studentFinal = (studentFinal*50)/100;
        studentProject = (studentProject*15)/100;

        int studentGrades = studentVisa + studentFinal + studentProject;
        System.out.println("Point -> " + studentGrades);

        if(studentGrades<=100 && studentGrades>=90){
            System.out.println("AA");
        }else if(studentGrades<=89 && studentGrades>=80){
            System.out.println("BA");
        }else if(studentGrades<=79 && studentGrades>=70){
            System.out.println("BB");
        }else if(studentGrades<=69 && studentGrades>=50){
            System.out.println("CB");
        }else if(studentGrades<=49 && studentGrades>=45){
            System.out.println("CC");
        }else if(studentGrades<=45 && studentGrades>=40){
            System.out.println("DC");
        }else{
            System.out.println("FF");
        }
    }
}
