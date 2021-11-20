import java.util.Arrays;
import java.util.Random;

public class MultiArrays {
    public static void main(String[] args) {

        int [][] students = new int[40][3];  //0 math 1 english 2 science

        for(int i = 0; i<40; i++)
        {
            for(int k = 0; k<3; k++){

                Random rnd = new Random();
                int note = rnd.nextInt(100)+1;
                students[i][k]=note;
            }
        }
        for(int i = 0; i<40; i++){
            for(int k = 0; k<3; k++) {
                String lessonName = "";
                if (k == 0) {
                    lessonName = "Math";
                } else if (k == 1)
                    lessonName = "English";
                else{
                    lessonName = "Science";
                }
                System.out.println((i+1) + ". The Student " +lessonName + " Note Of The Course = " + students[i][k]);
            }
        }
    }
}
