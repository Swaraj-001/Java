import java.util.*;

public class Max_Min {
    public static void main(String[] arg) {
        int N1 = 0, N2 = 0;
        Scanner s = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Enter 1st Number : ");
        N1 = s.nextInt();
        System.out.println(" ");
        System.out.print("Enter 2nd Number : ");
        N2 = s.nextInt();

        if (N1 == N2) {
            System.out.println(" ");
            System.out.println("Both numbers are equal");
            System.out.println(" ");
        } else if (N1 > N2) {
            System.out.println(" ");
            System.out.println("Number " + N1 + " is Maximum");
            System.out.println(" ");
        } else {
            System.out.println(" ");
            System.out.println("Number " + N2 + " is Maximum");
            System.out.println(" ");
        }
        System.out.println("!!!...Thank You...!!!");
        System.out.println(" ");
    }

}
