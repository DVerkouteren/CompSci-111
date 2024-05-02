package Chapter2;

import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        //define radius
        // prompt the user for radius

        final double PI = 3.14159;
        System.out.println("Enter a value for radius:");
        Scanner bob = new Scanner(System.in);
        double radius = bob.nextDouble();

        //calculate area
        double area; 
        area = radius * radius * PI;

        //print the area
        System.out.println("The area of a circle with rdius " + radius + " is " + area);

        bob.close();;
    }
}
