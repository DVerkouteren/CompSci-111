package Chapter7;
import java.util.*;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int even = 0;
        int[] nums = new int[10];
        for (int i = 0; i<nums.length; i++) {
            System.out.println("Enter a number: ");
            nums[i] = input.nextInt();
        }

        for (int i : nums) {
            if(i%2 == 0){
                even++;
                System.out.println(i);
            }
        }
        System.out.println("There are " + even + " even numbers in your array");
        input.close();
    }
}
