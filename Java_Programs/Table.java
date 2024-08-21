import java.util.*;

public class Table {
    public static void main(String[] args) {
        int N1 = 0, i = 1, a = 0;
        Scanner s = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Enter a number: ");
        N1 = s.nextInt();
        System.out.println(" ");

        while (i <= 10) {
            a = N1 * i;
            System.out.println(N1 + " x " + i + " = " + a);
            System.out.println(" ");
            i++;
        }
    }
}