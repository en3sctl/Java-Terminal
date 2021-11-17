public class Example17 {

    public static void main(String[] args) {

        int color = (int)(Math.random()*4)+1;
        String sColor = "";
        switch(color){
            case 1:
                sColor = '\u2663'+" clubs";
                break;
            case 2:
                sColor = '\u2666'+" diamonds";
                break;
            case 3:
                sColor = '\u2665'+" hearts";
                break;
            case 4:
                sColor = '\u2660'+" spades";
                break;
        }

        int fig = (int)(Math.random()*12)+3;
        String sFig = "";

        switch (fig){
            case  1:
            case  2:
            case  3:
            case  4:
            case  5:
            case  6:
            case  7:
            case  8:
            case  9:
            case 10:
                sFig = ""+fig;
                break;
            case 11:
                sFig = "Jack";
                break;
            case 12:
                sFig = "Queen";
                break;
            case 13:
                sFig = "King";
                break;
            case 14:
                sFig = "Ace";
                break;

        }
        System.out.println(sFig +" "+sColor);
    }
}
