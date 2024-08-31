import java.util.*;

public class PrimeCheck {
    public static void main(String[] args) {
        int n = 0, a = 0, i = 2;
        Scanner s = new Scanner(System.in);
        System.out.print("\n\t\t Enter a number :\t");
        n = s.nextInt();
        while (i <= n / 2) {
            if (n % i == 0) {
                a = 1;
                break;
            }
                i++;
        }
        if (a == 1) {
            System.out.println("\n\t\t Number " + n + " is not a prime number");
        }
        else {
            System.out.println("\n\t\t Number " + n + " is a prime number");
        }
        System.out.println("\n\t\t\t !!!...Thank_You...!!!");
        s.close();
    }
                        
}
