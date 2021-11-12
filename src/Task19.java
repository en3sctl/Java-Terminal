
import java.util.Random;
import java.util.Arrays;
import java.util.*;
    public class MyClass {
        public static void main(String args[]) {
            Scanner scn  = new  Scanner(System.in);

            System.out.println("Please indicate the size of the array: ");
            int size =  scn.nextInt();

            System.out.println("Please  indicate the top number which will be  generated: ");
            int nums =  scn.nextInt();

            int count = 0;
            int append = 0;

            int [] arr = new int[size];
            boolean check = false;

            while(append < size){
                int k = getRandom(nums);
                check = Arrays.stream(arr).anyMatch(i -> i == k);

                System.out.println(check);    // I just added for the control.
                System.out.println(k);       // I just added for the control.

                if (check == false)
                    arr[append++]  = k;
                count++;
                check  = false;
            }
            System.out.println("With SIZE = " + size + " and NUMS = " + nums + " the array has been filled after " + count +  " trials.");
            System.out.println(Arrays.toString(arr));
        }

        public static int getRandom(int max){
            Random random = new Random();
            return random.nextInt(max - 1)  + 1;
        }
    }

