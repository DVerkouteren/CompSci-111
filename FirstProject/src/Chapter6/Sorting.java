package Chapter6;
import java.util.*;

public class Sorting {
    
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        displaySortedNumbers(num1, num2, num3);
        input.close();
    }
    public static void displaySortedNumbers(double num1, double num2, double num3){
        double[] nums = new double[3];

        if(num1 > num2 && num1 > num3){
            nums[0] = num1;
            if(num2 > num3){
                nums[1] = num2;
                nums[2] = num3;
            }
        }else if(num2 > num1 && num2 > num3){
            nums[0] = num2;
            if(num1 > num3){
                nums[1] = num1;
                nums[2] = num3;
            }
        }else if(num3 > num1 && num3 > num2){
            nums[0] = num3;
            if(num2 > num1){
                nums[1] = num2;
                nums[2] = num1;
            }
        } else{
            nums[0] = num1;
            nums[1] = num2;
            nums[2] = num3;
        }
        System.out.println(nums[0]+ ", " + nums[1] + ", " + nums[2]);
    }
}
