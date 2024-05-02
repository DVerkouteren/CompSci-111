package Chapter4;
import java.util.*;
public class cities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two cities");
        String city1 = input.nextLine();
        String city2 = input.nextLine();
        System.out.println((city2.compareToIgnoreCase(city1)>0)?city1 + ", " + city2: city2 + ", " + city1);
        input.close();
        // String bob = (city2.compareToIgnoreCase(city1) <= 0) ? System.out.println(city1 + ", "+city2): (System.out.println(city2 + ", "+city1));
    }
}
