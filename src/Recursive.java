public class Task2 {

    public class Recursive1 {
        static int count(int[] arr, int from, int what) {
            if (from >= arr.length)
                return 0;
    return count(arr, from + 1, what) +
            ((arr[from]== what) ? 1 : 0);
        }
        public static void main(String[] args) {
            int[] a = {2, 3, 2, 4, 3, 1, 6, 3, 2, 3};
            System.out.println("2 -> " + count(a, 0, 2));
            System.out.println("3 -> " + count(a, 0, 3));
        }
    }
}

