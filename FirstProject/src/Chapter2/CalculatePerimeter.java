package Chapter2;
import java.util.Scanner;
public class CalculatePerimeter {
    public static void main(String[] args) {
        //ask user for demensions
        System.out.println("What is the length of your rectangle?");

        //create scanner
        Scanner frank = new Scanner(System.in);
        //lenght
        double length = frank.nextDouble();

        //width
        System.out.println("What is the width of your rectangle?");
        double width = frank.nextDouble();

        double perimeter = (2 * width) + (2 * length);
        System.out.println("Your rectangle perimeter is: " + perimeter);
        frank.close();
    }
}
