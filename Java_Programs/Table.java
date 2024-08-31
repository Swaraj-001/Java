import java.util.*;

public class Table {
    public static void main(String[] args) {
        int N1 = 0, i = 1, a = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("\n\n\t\t Enter a number :\t");
        N1 = s.nextInt();
        System.out.print(" ");

        while (i <= 10) {
            a = N1 * i;
            System.out.println("\n\t\t\t " + N1 + " x " + i + " = " + a);
            i++;
        }
        System.out.println("\n\t\t !!!...Thank_You...!!!\n");
        s.close();
    }
}
