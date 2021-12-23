import java.io.*;
import java.util.*;
//HackerRank Challenge
//Read some unknown n lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while(scan.hasNext()){
            i++;
            System.out.println(i+ " "+scan.nextLine());
        }
    }
}
