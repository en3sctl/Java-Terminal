import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Some Boolean Value: "+"Values (True or False)");

        boolean a = scan.nextBoolean();
        boolean b = scan.nextBoolean();
        boolean c = scan.nextBoolean();

        boolean allThere = (!a && !b && !c);

        boolean exactlyOne = (!a && !b && c)||
                             (!a && b && !c)||
                             (a && !b && !c);

        boolean exactlyTwo = (a && b && !c)||
                             (a && !b && c)||
                             (!a && b && c);

        boolean atLeastOne = (a || b || c);

        boolean atLeastTwo = (a || b || !c);

        System.out.println("a, b, c = "+ a +", "+ b +", "+ c +"" +
                "\nallThere: "+ allThere+
                "\nexactlyOne: "+ exactlyOne+
                "\nexactlyTwo: "+ exactlyTwo+
                "\natLeastOne: "+ atLeastOne+
                "\natLeastTwo: "+ atLeastTwo);
    }
}
