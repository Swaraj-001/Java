import java.time.*;
import java.util.*;

public class Day_Name {
    public static void main(String[] args) {
        int Day = 0;
        System.out.print("\n Enter Day Number to Explore:  ");
        Scanner s = new Scanner(System.in);
        Day = s.nextInt();
        switch (Day) {
            case 1:
                System.out.println("\n The Day is Monday");
                break;
            case 2:
                System.out.println("\n The Day is Tuesday");
                break;
            case 3:
                System.out.println("\n The Day is Wednesday");
                break;
            case 4:
                System.out.println("\n The Day is Thursday");
                break;
            case 5:
                System.out.println("\n The Day is Friday");
                break;
            case 6:
                System.out.println("\n The Day is Saturday");
                break;
            case 7:
                System.out.println("\n The Day is Sunday");
                break;

            default:
                System.out.println("\n Day Number Invalid");
        }
    }

}