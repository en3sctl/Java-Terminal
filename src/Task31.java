public class footballGoals {
    public static void main(String[] args) {

        int[][] footballer = new int[5][3];
        footballer[0][0] = 14;
        footballer[0][1] = 21; //John
        footballer[0][2] = 8;

        footballer[1][0] = 5;
        footballer[1][1] = 26; //Igor
        footballer[1][2] = 21;

        footballer[2][0] = 14;
        footballer[2][1] = 10; //Piotr
        footballer[2][2] = 6;

        footballer[3][0] = 4;
        footballer[3][1] = 9; //Tomasz
        footballer[3][2] = 11;

        footballer[4][0] = 6;
        footballer[4][1] = 31; //Ahmet
        footballer[4][2] = 25;

        footballGoals hello = new footballGoals();
        hello.totalGoals(footballer);
        hello.totalGoals2017(footballer);
        hello.mostGoals2018(footballer);
        hello.totalGoalsIgor(footballer);

    }

    public void totalGoals(int[][] range) {

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 3; k++) {

                sum = sum + range[i][k];
            }
        }
        System.out.println("Total goals in season 3: " + sum);
    }

    public void totalGoals2017(int[][] range) {

        int total2017 = 0;
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 1; k++) {

                total2017 = total2017 + range[i][k];
            }
        }
        System.out.println("Total goals in the 2017 season: " + total2017);
    }

    public void mostGoals2018(int[][] range) {

        int mostGoals = 0;
        int index = 0;

        for (int i = 0; i < 5; i++) {
            for (int k = 1; k < 2; k++) {

                if (range[i][k] > mostGoals) {
                    mostGoals = range[i][k];
                    index = i;
                }
            }
        }
        if (index == 0) {

            System.out.println("Top Scorer John, Number of goals = " + mostGoals);
        } else if (index == 1) {
            System.out.println("Top Scorer Igor, Number of goals = " + mostGoals);
        } else if (index == 2) {
            System.out.println("Top Scorer Piotr, Number of goals = " + mostGoals);
        } else if (index == 3) {
            System.out.println("Top Scorer Tomasz, Number of goals = " + mostGoals);
        } else if (index == 4) {
            System.out.println("Top Scorer Ahmet, Number of goals = " + mostGoals);
        }
    }

    public void totalGoalsIgor(int[][] range) {

       int totalGoalsIgor = 0;

       for(int i =2; i<3; i++){
           for(int k =0; k<3; k++){

               totalGoalsIgor = totalGoalsIgor + range[i][k];
           }
       }
        System.out.println("Igor's Total Goals: " + totalGoalsIgor);
    }
}
