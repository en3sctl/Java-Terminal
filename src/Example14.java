import java.util.Arrays;
public class Example14 {
    public static void main(String[] args) {

        int []arr = {2,5,3,2,1,3,6,5,3};

        for(int i = 0; i< arr.length; i++){

            boolean withDisplay = false;

            for(int j = 0; j<i && !withDisplay; j++){
                if (arr[i] == arr[j])
                    withDisplay = true;
                }
            if(!withDisplay){
                System.out.println(arr[i]);
            }
        }
    }
}
