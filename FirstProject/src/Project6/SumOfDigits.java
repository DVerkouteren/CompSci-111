package Project6;

import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an intager");
        int n = input.nextInt();
        System.out.println(sumDigits(n));
        input.close();
    }

    public static int sumDigits(int n){
        int total = 0;
        int end = 0;
        while(n >= 10){
            end = (n % 10);
            n = (int)(n/10);
            total += end;
        }
        total += n;
        return total;
    }

}
