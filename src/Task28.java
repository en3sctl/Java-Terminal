import java.util.*;
public class Task09 {
        public static void main(String args[]) {

           int [][] arr = {{1,3,2}, {3,4,8}, {2,6,8}, {1,8,5}};

           int maxColVal = 0, maxRowVal = 0, maxColIndex = 0, maxRowIndex = 0;


           for(int i = 0; i<arr.length; i++)
                   maxRowVal += arr[0][i];

           for(int j = 0; j<arr.length; j++){
                   int temp = 0;

                   for(int i = 0; i<arr[0].length; i++)
                           temp = arr[j][i];

                   if(temp > maxRowVal){
                           maxRowVal = temp;
                           maxRowIndex = j;
                   }
           }
           for(int i = 0; i<arr[0].length; i++)
                   maxColVal += arr[i][0];

           for(int j = 0; j< arr[0].length; j++){
                   int temp = 0;

                   for(int i = 0; i< arr[j].length; j++){
                           temp += arr[i][j];

                           if(temp > maxColVal){
                                   maxColVal = temp;
                                   maxColIndex = j;
                           }
                    }
              }
        }
}


