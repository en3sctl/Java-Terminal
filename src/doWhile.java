package c07;

import java.util.Scanner;

public
    class Task0707 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int var1, var2, var3;

        do{
            var1 = scan.nextInt();
        }while (var1 < 0);

        do{
            var2 = scan.nextInt();
        }while (var2 < 0);

        do{
            var3 = scan.nextInt();
        }while (var3 < 0);

        int max;
        if(var1 > var2 && var1 > var3)
            max = var1;
        else
            if(var2 > var3)
                max = var2;
            else
                max = var3;

        for(int i=max; i > 0; i--){
            System.out.print( i <= var1 ? "*" : " ");
            System.out.print( i <= var2 ? "*" : " ");
            System.out.print( i <= var3 ? "*" : " ");

            System.out.println();
        }
    }
}
