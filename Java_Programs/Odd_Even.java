import java.util.*;

public class Odd_Even {
    public static void main(String arg[]){
        int num = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\t\t Enter a number :\t");
        num = sc.nextInt();

        if( num % 2 == 0){
            System.out.println("\n\t\t Number " + num + " is an Even Number.\n");
        }
        else{
            System.out.println("\n\t\t Number " + num + " is an ODD Number.\n");
        }
        System.out.println("\n\t\t !!!...Thank_You...!!!");
        sc.close();
    }
    
}
