import java.util.Scanner;
public class exam {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);              //Swap Program
        System.out.println("Please Enter n: ");
        int n = scan.nextInt();
        int [] swap = new int[n];
        int index_smallest = 0;
        int smallest = Integer.MAX_VALUE;

        for(int i =0; i< swap.length; i++){
            System.out.println("Please Enter a number: ");
            swap[i] = scan.nextInt();
        }
        for(int i =0; i< swap.length; i++){
            if(smallest > swap[i]){
                smallest = swap[i];
                index_smallest = i;
            }
        }
        int temp = swap[0];
        swap[0] = swap[index_smallest];
        swap[index_smallest] = temp;

        System.out.println("\n");
        for(int element : swap){
            System.out.println(element);
        }
    }
}
