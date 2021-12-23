import java.util.Arrays;

public class StringCmp {
    public static boolean isLess(String s1, String s2) {
        boolean smaller = false;
        int compare = s1.compareTo(s2);
        if (compare < 0)
            smaller = true;
        return smaller;
    }

    public static void sortSel(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println(arr[i]);
                System.out.println(arr[j]);
                if (isLess(arr[j], arr[i])) {
                    String tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Kate", "Bea", "Mary", "Bea", "Zoe"};
        System.out.println(Arrays.toString(arr));
        sortSel(arr);
        System.out.println(Arrays.toString(arr));
    }
}

