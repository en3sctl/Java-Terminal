
import java.util.Arrays;
public class Example13 {
    public static void main(String[] args) {

        int []arr = new int[4];
        int []arr1 = {1,4,2,5};
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]+" ");

            int tmp [];
            arr1[0] = 2;
            arr1[1] = 5;
            arr1[2] = 1;
            arr1[3] = 4;

            tmp = arr;
            tmp = arr1;
            arr = tmp;

            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(arr1));

        }
    }
}   
   
