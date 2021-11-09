import java.util.*;
import java.util.Arrays;

public class Example6 {
        public static void main(String args[]) {

            Scanner scan = new Scanner(System.in);

            boolean resultSum, resultInt, resultSymDiff;
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            int sumX = a < c ? a : c;
            int sumXnot = a < c ? c : a;
            int sumY = b > d ? b : d;
            int sumYnot = b > d ? d : b;
            for (int i = -5; i <= 5; i++){
                resultSymDiff = i >= sumX ? (i < sumXnot ? true : (i > sumYnot ? (i <= sumY ? true : false): false)) : false;
                resultSum = i < sumX ? false : (i > sumY ? false : true);
                resultInt = i >= sumXnot ? (i <= sumYnot ? true : false) : false;
                System.out.println(i+": inSum? "+resultSum+"; inIntersect? "+ resultInt+"; inSymDiff? "+resultSymDiff);
            }
        }
    }

