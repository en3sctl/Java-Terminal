import java.util.*;

public class Examplee {
        public static void main(String[] args) {

            double mile = 1.609344;
            double galon = 3.785412;

            double prop = galon / mile * 100;

            System.out.println(
                "Enter The Fuel Consumption and units (\"eu\" or \"usa\")");
            Scanner scan = new Scanner(System.in);
            double fuel = scan.nextDouble();
            String units = scan.next();

            System.out.println(switch (units) {
                case "eu" -> "" + prop / fuel + "mpg";
                case "usa" -> "" + prop / fuel + "l/km";
                default -> "error";
            }
            );
        }
    }
