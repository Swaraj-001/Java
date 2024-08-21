import java.util.*;

public class Three_num_comp {
    public static void main(String arg[]) {
        int a = 0, b = 0, c = 0;
        Scanner s = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Enter the first number :");
        a = s.nextInt();
        System.out.println(" ");
        System.out.print("Enter the second number :");
        b = s.nextInt();
        System.out.println(" ");
        System.out.print("Enter the third number :");
        c = s.nextInt();

        if (c == b && b == a) {
            System.out.println("  ");
            System.out.println("    All Numbers are Same");
        } else if (a >= b && a >= c) {
            System.out.println(" ");
            System.out.println("    " + a + " is greater");
        } else if (b >= a && b >= c) {
            System.out.println(" ");
            System.out.println("    " + b + " is greater");
        } else if (c >= b && c >= a) {
            System.out.println(" ");
            System.out.println("    " + c + " is greater");
        }
    }

}