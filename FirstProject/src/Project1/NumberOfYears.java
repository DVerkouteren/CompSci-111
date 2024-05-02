package Project1;
import java.util.*;
public class NumberOfYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//create scanner
        System.out.println("How many days? ");//asks user
        int days = input.nextInt();//reads days
        int years = days/365;//converts to years
        int remainingDays = days%365;//module for remianing days
        System.out.println("You must wait "+years+" years and "+remainingDays+" days");//displays years
        input.close();//close scanner :(
    }
}
