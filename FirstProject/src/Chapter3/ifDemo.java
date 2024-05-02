package Chapter3;

import java.util.*;
public class ifDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//create scanner

        System.out.println("Enter an inteager: ");
        int userInt = input.nextInt();

        if(userInt % 5 == 0){
            System.out.println("You're number is divisable by five");
        }if(userInt%2==0){
            System.out.println("HiEven");
        }
        else{
            System.out.println("You're number is not divisable by five");
        }
        input.close();

    }
    
    public static void elif(String[] args){
        
    }

}
