package Chapter2;
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        System.out.println("Enter the in seconds");
        Scanner input = new Scanner(System.in);
        int seconds = input.nextInt();

        //convert seconds to minutes
        int minute = seconds/60;

        //calculate remaining seconds
        int remaing = seconds % 60;
        if(remaing == 0){
            System.out.println("That is "+minute+" minutes");
        }else{
            System.out.println("That is "+minute+" minutes and "+remaing+" seconds");
        }
        input.close();
    }

}
