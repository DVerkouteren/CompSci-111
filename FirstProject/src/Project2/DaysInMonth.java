package Project2;
import java.util.*;
public class DaysInMonth {
    public static void main(String[] args) {
        //this is a comment
        Scanner input = new Scanner(System.in);
        System.out.println("What year is it?");
        int year = input.nextInt();
        System.out.println("What month is it?");
        int month = input.nextInt();

        if (year % 4 == 0 && month == 2 && month % 100 != 0 && month % 400 == 0) {
            System.out.println("There are 29 days in Febuary");
        }else if(month == 2){
            System.out.println("There are 28 days in Febuary");
        }else{
            switch (month % 2) {
                case 1:
                    System.out.println("There are 31 days");break;
                case 0:
                    System.out.println("There are 30 days in");break;
            }
    }
    input.close();
}
}
