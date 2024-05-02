package Chapter2;
import java.util.*;
public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entere sale price");
        double total = input.nextDouble();

        double tax = total * 0.095;
        tax = (int)(tax*100)/100.0;

        System.out.println(tax);
        input.close();
    }
}
