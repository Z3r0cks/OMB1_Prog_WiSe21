import java.util.Scanner;

public class L02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Randdicke");
        int border = 3;
        //System.out.println("Seitenlänge");
        int width = 2;

        // b
         /*for (int i = 0; i < input; i++) {
           // System.out.println("modulo: "+ i % 3);
           if (i % 3 == 2 )
               System.out.println("o");
            else
               System.out.print("o");
        }*/

        // c
        /* for (int i = 0; i < input; i++) {
           switch (i){
               case 0:
               case 1:
               case 3:
               case 5:
                   System.out.print("o");
                   break;
               case 2:
               case 4:
                   System.out.println("o");
                   break;
           }
        }*/

        //d

        for (int i = 0; i < (width + 2 * border); i++) {
            for (int j = 0; j < (width + 2 * border); j++) {
                if (i < border || i >= (border + width) || j < border || j >= (border + width)) {
                    System.out.print("+");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}