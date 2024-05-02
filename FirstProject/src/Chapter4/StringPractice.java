// package Chapter4;
// import java.util.*;

// public class StringPractice{
//     /**
//      * @param args
//      */
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         String s1 = "";
//         for(int i = 1; i < 6; i++){
//             s1 = s1.concat("*");
//             System.out.println(s1);
//         }
//         boolean d = 3<4;
//         System.out.printf("%1.2b", d);
//         int n = 0;
//         boolean a = n >50;
//         boolean dayb = false;
//         do{
//             System.out.println("When is your birthday? ");
//             String bday = input.next();
//             dayb = bday.equalsIgnoreCase("April 18th");
//         }
//         while(!dayb);
//         System.out.println("not yet");
//         input.close();
//     }
// }