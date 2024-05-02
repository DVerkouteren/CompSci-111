package Project1;
import java.util.*;

public class MileToKm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//create scanner
        System.out.println("Enter amount of miles");//ask user
        double miles = input.nextDouble();//reads scanner
        double kilos = miles * 1.6;//convert to kilometers
        System.out.println("That is "+kilos+" kilometers");//display kilos
        input.close();//close scanner
    }
}
