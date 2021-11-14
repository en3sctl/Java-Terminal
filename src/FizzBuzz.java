import java.util.stream.IntStream;
public class Main {
    public static void main(String args[]) {
      //fizzBuzzBeforeJava8(10);
      fizzBuzzAfter8(36);
    }
    /*private static void fizzBuzzBeforeJava8(int num){
        for (int i = 1; i<= num; i++){
            if (((i % 5) == 0) && ((i % 7) == 0))
                System.out.println("fizzbuzz");
            else if((i % 5) == 0)
                System.out.println("fizz");
            else if((i % 7) == 0)
                System.out.println("buzz");
            else
                System.out.println(i);
        }
    }*/
    private static void fizzBuzzAfter8(int num){
        IntStream.rangeClosed(1,num)
                .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz": "Fizz") : (i % 7 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }
}