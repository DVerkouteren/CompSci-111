package Project41;
import java.util.*;

public class CountChar {
    public static void main(String[] args) {
        System.out.println("Eneter a string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int count = count(str);
        System.out.println(count);
        input.close();
    }
    public static int count(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.substring(i, i+1).equals("e")){

                count++;
            }
        }
        return count;
    }

}
