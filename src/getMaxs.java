public class Taskz07 {

    public static int[] getMaxs(int[][] tab) {

        int res[] = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            int maxI = 0;
            for (int j = 1; j < tab[i].length; j++) { //We are finding the maxs
                if (tab[i][maxI] < tab[i][j])
                    maxI = j;

                res[i] = tab[i][maxI];
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[][] arr = {{1, 3}, {3, 4, 5, 8}, {6, 8}, {1, 9, 6}};
        for (int val : getMaxs(arr)) {
            System.out.print(" " + val);
            System.out.println();

        }
    }
}
