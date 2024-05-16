package ExtraCredit.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Recursive{
    public static void main(String[] args) {
        //String and char
        // System.out.println("Input any string");
        // Scanner input = new Scanner(System.in);
        // String text = input.nextLine();
        // System.out.println("Input a character");
        // String letter = input.nextLine();
        // char let = letter.charAt(0);
        // System.out.println(count1(text,let));

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(3);
        arr1.add(4);
        System.out.println("main" + maxValue(arr1));
    }

    public static int count(String str, char a){
        int count = 0;
        String b = Character.toString(a);
       for (int i = 0; i < str.length(); i++) {
        count += (str.substring(i,i+1).equals(b)) ? 1 : 0;
       }
       return count;
    }

    public static int count1(String str, char a){
        int ct = 0;
        if(str.length() > 0){
            if (str.charAt(0) == a){
                ct++;
            }return ct + count1(str.substring(1),a);
        }
        return ct;
    }

    public static int maxValue(ArrayList<Integer> arr){
        int max = -1000;
        ArrayList<Integer> temp = arr;

        if(temp.size() > 0){
            if(temp.get(0) > max){
                max = temp.get(0);
                System.out.println(temp.get(0) + "  max:" +max);
                
            }
            temp.remove(0);
            maxValue(temp);
            max = maxValue(temp);
        }
        return max;
    }
}