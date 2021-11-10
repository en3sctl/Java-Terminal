public class Example12 {
    public static void main(String[] args) {
        int a = 20;
        int b = 23;
        int c = 26;

        if(a==b && b==c){
            System.out.println("\"Mıddle Number Is: "+ a);
        }else{
            if(a>=b && a>=c){
                if(b>=c){
                    System.out.println("Mıddle Number Is: "+ b);
                }else if(c>=b){
                    System.out.println("Mıddle Number Is: "+ c);
                }
            }
            if(b>=a && b>=c){
                if(a>=c){
                    System.out.println("Mıddle Number Is: "+ a);
                }else if(c>=b){
                    System.out.println("Mıddle Number Is: "+ c);
                }
            }
            if(c>=a && c>=b){
                if(a>=b){
                    System.out.println("Mıddle Number Is: "+ a);
                }else if(b>=a){
                    System.out.println("Mıddle Number Is: "+ b);
                }
            }
        }
    }
}
