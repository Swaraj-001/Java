import java.util.*;

public class Three_num_comp {
    public static void main(String arg[]) {
        int a = 0, b = 0, c = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("\n\t Enter the first number :\t");
        a = s.nextInt();
        System.out.print("\n\t Enter the second number :\t");
        b = s.nextInt();
        System.out.print("\n\t Enter the third number :\t");
        c = s.nextInt();

        if (c == b && b == a) {
            System.out.println("\n\t\t\t All Numbers are Same");
        } else if (a >= b && a >= c) {
            System.out.println(" \n\t\t\t " + a + " is greater");
        } else if (b >= a && b >= c) {
            System.out.println(" \n\t\t\t " + b + " is greater");
        } else if (c >= b && c >= a) {
            System.out.println(" \n\t\t\t " + c + " is greater");
        }

        System.out.println(" \n\t\t !!!...Thank_You...!!! \n");
        s.close();
    
    }

}
