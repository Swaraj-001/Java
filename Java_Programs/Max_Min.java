import java.util.*;

public class Max_Min {
    public static void main(String[] arg) {
        int N1 = 0, N2 = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("\n\t\t Enter 1st Number :\t");
        N1 = s.nextInt();
        System.out.print("\n\t\t Enter 2nd Number :\t");
        N2 = s.nextInt();

        if (N1 == N2) {
            System.out.println("\n\t\t Both numbers are equal. \n");
        } else if (N1 > N2) {
            System.out.println("\n\t\t Number " + N1 + " is Maximum. \n");
        } else {
            System.out.println("\n\t\t Number " + N2 + " is Maximum. \n");
        }
        System.out.println("\n\t\t!!!...Thank_You...!!! \n");
        System.out.println(" ");

        s.close();
    }

}
