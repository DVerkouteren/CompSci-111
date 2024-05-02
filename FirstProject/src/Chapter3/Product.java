package Chapter3;
import java.util.*;
public class Product {
    public static void main(String[] args) {
        int num1 = (int)(Math.random()*10);
        int num3 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        Scanner input = new Scanner(System.in);
        System.out.println("what is the product of " +num1+", "+num2+", "+num3);
        int user = input.nextInt();
        int product = num1*num2*num3;
        if(user == product){
            System.out.println("YAY");
        }else{
            System.out.println("Tough luck");
        }
        input.close();
    }
}
