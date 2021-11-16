public class Homework {
    public static void main(String[] args) {

        boolean isFemale = true;
        boolean isYoung = true;
        String str1 = switch ((isFemale ? 0b01:0b00) +
                             (isYoung ? 0b10:0b00)){

            case 0b00 -> "Man";
            case 0b01 -> "Woman";
            case 0b10 -> "Boy";
            case 0b11 -> "Girl";
            default -> "";

        }
            System.out.println(str1);
    }
}