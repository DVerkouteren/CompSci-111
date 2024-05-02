package Chapter3;

import java.util.*;
public class children {
    public static void main(String[] args) {
        int firstNumber = (int)(Math.random()*10);//random int (0-9)
        int secondNumber = (int)(Math.random()*10);//random int (0-9)
    
        Scanner input = new Scanner(System.in);//create scanner

        System.out.println("What is "+firstNumber+" + "+secondNumber+" ?");//ask user
        int userNumber = input.nextInt();//get input
        while(userNumber != firstNumber + secondNumber){
            if(userNumber == firstNumber + secondNumber){//calculate
                System.out.println("Correct! You're so smart!!");//correct
            }else{
                System.out.println("You failed :(");//wrong
                System.out.println("Try again");
                userNumber = input.nextInt();//get input
            }
        }
        if(userNumber == firstNumber + secondNumber){//calculate
                System.out.println("Correct! You're so smart!!");//correct
            }

        input.close();//close scanner
    }
}
