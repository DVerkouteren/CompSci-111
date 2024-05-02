package Chapter2;

import java.util.*;
public class CalculateTip {
    public static void main(String[] args) {
        //ask user for meal cost
        System.out.println("What is the cost of your meal?");
        //create scanner
        Scanner input = new Scanner(System.in);
        double original = input.nextDouble();
        //ask user for tip precentage
        System.out.println("What precentage do you want to tip? ex: 0.20");
        double tipPrecentage = input.nextDouble();
        //calculate tip
        double tip = (int)(100*original*tipPrecentage)/100.0;
        //print tip
        System.out.print("You will need to pay an extra "+tip);
        //print total
        original = (int)(original *100)/100.0;
        double total = tip + original;
        System.out.println(", for a total of " +total);
        //close scanner
        input.close();
    }
}
