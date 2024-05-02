package Chapter2;

import java.util.Scanner;
public class Tempature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Tempature in Fahrenheit");
        double f = input.nextDouble();

        double c = (5.0/9)*(f - 32);

        System.out.println("In Clesiuos: " + c);

        input.close();
    }
}
