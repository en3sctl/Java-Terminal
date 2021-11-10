public class Example13 {
    public Integer factorial(Integer n) {

        int factorial = n;
        for (int j = n - 1; j > 0; j--) {
            factorial = factorial * j;
        }
        return factorial;
    }
}   
   
