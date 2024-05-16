package Chapter12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = '3';
        Scanner input = new Scanner(System.in);

        try{
            num1 = input.nextInt();
            System.out.println(num1/num2);
        }catch(InputMismatchException e){
            System.out.println("Enter an intager only");
        }catch(ArithmeticException e){

        }
        input.close();
    }
}
