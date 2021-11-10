import java.util.Collections;
import java.util.Arrays;
public class Example15 {
    public static void main(String[] args) {
        Integer [] arr = new Integer[]{1,5,8,2,6};
        int max = Collections.max(Arrays.asList(arr));
        System.out.println("Maximum: "+max);

        for(int i = max; i>0; i--){
            for(int j =0; j< arr.length; j++){
                if(arr[j]>= i){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for(int j = 0; j< arr.length; j++){
            System.out.println(" " +(j+1)+ " ");
        }
    }
}
