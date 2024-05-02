package Chapter3;
import java.util.*;
public class caseandbreak {
    public static void main(String[] args) {
        System.out.println("Are you cool?");
        Scanner input = new Scanner(System.in);
        String daniel = input.next();
        String[] animals = new String[]{"Monkey","Pig"};
        double  x = 1;
        int y;
        y = (x>0) ? 1 : -1;
     
        
        switch(daniel){
            case "yes","y","Yes","YES":
                System.out.println(animals[0]);
                break;
            case "no","n","NO","No":
                System.out.println(y);
                break;
            case "idk":
                System.out.println((x % y == 0)? x + "who": x+"why");
                break;
        }
        input.close();
    }
}
