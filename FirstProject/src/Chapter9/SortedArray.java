package Chapter9;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {

        double[] Array = new double[10];

        for (int i = 0; i < Array.length; i++) {
            Array[i] = (Math.random()*11);
            Array[i]=Math.ceil(Array[i]*100)/100;
        }

        sorted(Array);

        for (double d : Array) {
            System.out.println(d);
        }
    }   
    public static double[] sorted(double[] arr){
        Arrays.sort(arr);
        return arr;
    }
}
