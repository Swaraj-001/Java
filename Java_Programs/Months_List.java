import java.time.Month;
import java.util.*;

public class Months_List {
    public static void main(String[] args) {
        System.out.println("Enter Month Number to Explore:");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        switch (m) {
            case 1:
                System.out.println("The Month is January");
                break;
            case 2:
                System.out.println("The Month is Febuary");
                break;
            case 3:
                System.out.println("The Month is March");
                break;
            case 4:
                System.out.println("The Month is April");
                break;
            case 5:
                System.out.println("The Month is May");
                break;
            case 6:
                System.out.println("The Month is June");
                break;
            case 7:
                System.out.println("The Month is July");
                break;
            case 8:
                System.out.println("The Month is August");
                break;
            case 9:
                System.out.println("The Month is September");
                break;
            case 10:
                System.out.println("The Month is October");
                break;
            case 11:
                System.out.println("The Month is November");
                break;
            case 12:
                System.out.println("The Month is December ");
                break;
            default:
                System.out.println("Month Invalid");
        }
    }

}