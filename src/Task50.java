import java.util.Arrays;
public class Task3 {

    public static void main(String[] args) {
        System.out.println("Wait...");
        System.out.println(Task3.fiboR(45));
        System.out.println(Task3.fiboI(45));
        System.out.println(Task3.factR(12));
        System.out.println(Task3.factI(12));
        System.out.println(Task3.gcdR(12125, 40643));
        System.out.println(Task3.gcdI(12125, 40643));
        int[] a = {3, 8, 2, 9, 7, 4};
        System.out.println("Max     : " + Task3.maxElem(a, 0));
        System.out.println("Num even: " + Task3.numEven(a, 0));
        System.out.println("Before:   " + Arrays.toString(a));
        Task3.reverse(a, 0);
        System.out.println("After :   " + Arrays.toString(a));
        System.out.println("Is 'radar' a palindrom? " +
                Task3.isPalindrom("radar"));
        System.out.println("Is 'abba' a palindrom?  " +
                Task3.isPalindrom("abba"));
        System.out.println("Is 'rover' a palindrom? " +
                Task3.isPalindrom("rover"));
    }

    public static int fiboR(int n) {
        if (n < 2)
            return n;
        else
            return fiboR(n - 1) + fiboR(n - 2);
    }

    public static int fiboI(int n) {
        int num1 = 0, num2 = 1;
        int counter = 0;
        while (counter < n){
            int num3 = num1+num2;
            num1 = num2;
            num2 = num3;
            counter++;
        }
        return num1;
    }

    public static int factR(int n) {
        if (n == 0)
            return 1;
        else
            return n * factR(n - 1);
    }

    public static int factI(int n) {
        int result = 1;
        while (n > 1) {
            result = result * n;
            n -= 1;
        }
        return result;
    }

    public static int gcdR(int a, int b) {
        if (b == 0)
            return a;
        return gcdI(b, a % b);
    }

    public static int gcdI(int a, int b) {
        if(a==0)
            return a;
        else if(b==0)
            return b;
        while (a!=b){
            if(a>b)
                a = a-b;
            else
                b= b-a;
        }
        return a;
    }

    public static int maxElem(int[] arr, int from) {
        if (from > 0) {
            return Math.max(arr[from], maxElem(arr, from - 1));
        } else {
            return arr[0];
        }
        /* IT CAN BE USEFUL TO

        if(from == arr.lenght-1)
        return arr[from];
        int max = maxElem(arr, from+1);
        return arr[from] > max ? arr[from] : max;

         */
    }

    public static int numEven(int[] arr, int from) {
        if (from >= arr.length)
            return 0;
        return (arr[from] % 2 == 0 ? 1 : 0) + numEven(arr, from + 1);
    }

    public static void reverse(int[] arr, int from) {
        if(arr.length / 2 < from)
            return;
        
        int tmp = arr[from];
        arr[from] = arr[arr.length-1-from];
        arr[arr.length-1-from] = tmp;

        reverse(arr, from+1);
    }
    public static boolean isPalindrom(String s) {
        String treverse = treverse(s);
        if(s.equals(treverse)){
            return true;
        }
        return false;
    }
    public static String treverse(String input){
        if(input == null || input.isEmpty()){
            return input;
        }
        return input.charAt(input.length()-1)+treverse(input.substring(0,input.length()-1));
    }
}
