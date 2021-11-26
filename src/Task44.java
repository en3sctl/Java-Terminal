public class Taskz07_1 {
    public static void main(String[] args) {
        System.out.print("[ ");
        int[] x = printArr();
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "");
            System.out.print(" ");
        }
        System.out.println("]");
        int[] odds = numOdd(7); //You can enter whatever you want
        System.out.println(odds[0] + ", " + odds[1] + ", " + odds[2]);
        int[] evens = numEven(9); //You can enter whatever you want but you have to change sout to.
        System.out.println(evens[1] + ", " + evens[2] + ", " + evens[3] + ", " + evens[4]);
        getOddEven(0, 0);

        int[] brr = {2,45,8,-43,33,22,47};
        int maxIndex = getMaxIndex(brr);
        System.out.println("Max Index Is: "+maxIndex);
        int minIndex = getMinIndex(brr);
        System.out.println("Min Index Is: "+minIndex);
    }

    public static int[] printArr() {

        int[] arr = {1, 2, 3, 4, 5};
        return arr;
    }

    public static int[] numOdd(int numOdds) {

        int[] numOdd = new int[numOdds];
        int start = 1;
        for (int i = 0; i < numOdd.length; i++) {
            numOdd[i] = start;
            start = start + 2;
        }
        return numOdd;
    }

    public static int[] numEven(int numEvens) {

        int[] numEven = new int[numEvens];
        int start = 0;
        for (int i = 0; i < numEven.length; i++) {
            numEven[i] = start;
            start = start + 2;
        }
        return numEven;
    }

    public static int[] getOddEven(int even, int odd) {

        int[] oddsEvens = {5, 6, 7, 8, 9,23,344,765};
        for (int i = 0; i < oddsEvens.length; i++) {
            if (oddsEvens[i] % 2 == 0)
                System.out.println(oddsEvens[i] + " is even");
            else
                System.out.println(oddsEvens[i] + " is odd");
        }
        return oddsEvens;
    }
    public static int getMaxIndex(int[] brr){

        int max = brr[0];
        int indexForMax = 0;
        for (int i = 0; i < brr.length ; i++) {
            int score = brr[i];
            if(max < score){
                max = score;
                indexForMax =i;
            }
        }
        return  indexForMax;
    }
    public static int getMinIndex(int[] brr){
        int min = brr[0];
        int indexForMin = 0;
        for (int i = 0; i < brr.length ; i++) {
            int score = brr[i];
            if(min > score){
                min = score;
                indexForMin = i;
            }
        }
        return indexForMin;
    }
}
