import java.util.*;

public class Odd_Even {
    public static void main(String[] args) {
        System.out.println("");
        System.out.print("Enter a Number : ");
        Scanner s = new Scanner(System.in);
        int N1 = s.nextInt();
        System.out.println("");
        if (N1 % 2 == 0) {
            System.out.println("Number  " + N1 + "  is Even");
        } else {
            System.out.println("Number  " + N1 + "  is Odd");
        }
        System.out.println("");
        System.out.println("!!!...Thank You...!!!");
    }

}
