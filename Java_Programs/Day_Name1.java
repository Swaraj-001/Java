import java.time.*;
import java.util.*;

public class Day_Name1 {
    public static void main(String[] args) {
        int Day = 0;
        System.out.print("\n Enter Day Number to Explore:  ");
        Scanner s = new Scanner(System.in);
        Day = s.nextInt();
        if (Day == 1) {
            System.out.println("\n The Day is Monday");
        } else if (Day == 2) {
            System.out.println("\n The Day is Tuesday");
        } else if (Day == 3) {
            System.out.println("\n The Day is Wednesday");
        } else if (Day == 4) {
            System.out.println("\n The Day is Thursday");
        } else if (Day == 5) {
            System.out.println("\n The Day is Friday");
        } else if (Day == 6) {
            System.out.println("\n The Day is Saturday");
        } else if (Day == 7) {
            System.out.println("\n The Day is Sunday");
        } else {
            System.out.println("\n Day Number Invalid");
        }
    }

}