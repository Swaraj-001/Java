import java.util.*;

public class TableR {
    public static void main(String[] args) {
        int N1 = 0, i = 10, a = 0;
        Scanner s = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Enter a number: ");
        N1 = s.nextInt();
        System.out.println(" ");

        while (i >= 1) {
            a = N1 * i;
            System.out.println("\n   " + N1 + " x " + i + " = " + a);
            i--;
        }
    }
}