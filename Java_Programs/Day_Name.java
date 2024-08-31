import java.util.*;

public class Day_Name 
{
    public static void main() 
    {
        int Day = 0;
        String dayString;
        
        System.out.print("\n\t\t Enter Day Number to Explore:  ");
       
        Scanner s = new Scanner(System.in);
        Day = s.nextInt();

        switch (Day) 
        {
            case 1:
                    dayString = "Monday";
                    break;
            case 2:
                    dayString = "Tuesday";
                    break;
            case 3:
                    dayString = "Wednesday";
                    break;
            case 4:
                    dayString = "Thursday";
                    break;
            case 5:
                    dayString = "Friday";
                    break;
            case 6:
                    dayString = "Saturday";
                    break;
            case 7:
                    dayString = "Sunday";
                    break;
            default:
                    dayString = "Day Number Invalid";
        }
        System.out.println("\n\t\t\t The Day is "+dayString+". ");
        System.out.println("\n\t\t\t !!!...Thank_You...!!!\n");
        s.close();
    }

}
