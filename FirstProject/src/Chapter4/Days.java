package Chapter4;
import java.util.*;
public class Days {
    public static void main(String[] args) {
        System.out.println("Enter an int 0-6");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        switch(day){
            case 1:System.out.println("Monday");break;
            case 2:System.out.println("Tuesday");break;
            case 3:System.out.println("Wednesday");break;
            case 4:System.out.println("Thrusday");break;
            case 5:System.out.println("Friday");break;
            case 6:System.out.println("Saturday");break;
            case 0:System.out.println("Sunday");break;
            
        }
        input.close();
    }
}
