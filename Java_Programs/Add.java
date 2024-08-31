import java.util.*;

public class Add {
    public static void main(String[] args) {
        int N1 = 0 , N2 = 0 ,sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("\n\t\t Enter 1st Number : \t");
        N1 = s.nextInt();
        System.out.print("\n\t\t Enter 2nd Number : \t");
        N2 = s.nextInt();
        sum = N1+N2;
        System.out.println("\n\n\t\t Addition of "+N1+" and "+N2+" is "+sum );
        System.out.println("\n\n\t\t!!!... Thank You ...!!!\n");
        s.close();
    }    

}
