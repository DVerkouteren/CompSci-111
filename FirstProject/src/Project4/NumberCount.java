package Project4;
import java.util.*;

public class NumberCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you numbers, type 'quit' to stop: ");
        boolean quit = false;
        int num = 0;
        int numPos = 0;
        int numNeg = 0;
        int numZero = 0;

        while(!quit){
            String text = input.next();
            if(text.equals("quit")){
                quit = true;
                break;
            }
            num = Integer.parseInt(text);
            
        
            if(num > 0){
                numPos = numPos + 1;
            }if(num < 0){
                numNeg = numNeg + 1;
            }if(num == 0){
                numZero = numZero + 1;
            }
        }
        System.out.println("You have "+numPos+" positive numbers, "+
        numNeg + " negative numbers, and " + 
        (numZero)  + " zeros");
        input.close();
    }
    

}
