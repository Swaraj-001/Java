import java.util.*;

public class Three_num_comp {
    public static void main(String arg[]) {
        int N1 = 0, N2 = 0, N3 = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("\n\t Enter the first number :\t");
        N1 = s.nextInt();
        System.out.print("\n\t Enter the second number :\t");
        N2 = s.nextInt();
        System.out.print("\n\t Enter the third number :\t");
        N3 = s.nextInt();

        if (N3 == N2 && N2 == N1) {
            System.out.println("\n\t\t\t All Numbers are Same");
        } else if (N1 >= N2 && N1 >= N3) {
            System.out.println(" \n\t\t\t " + N1 + " is greater");
        } else if (N2 >= N1 && N2 >= N3) {
            System.out.println(" \n\t\t\t " + N2 + " is greater");
        } else if (N3 >= N2 && N3 >= N1) {
            System.out.println(" \n\t\t\t " + N3 + " is greater");
        }

        System.out.println(" \n\t\t !!!...Thank_You...!!! \n");
        s.close();
    
    }

}
