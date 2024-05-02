package Chapter6;

public class InToCm {
    public static void main(String[] args) {
        System.out.println("inches \t" + "Centimeters");
        double Centimeters = 0;

        for (double i = 1.0; i <= 5.0; i++) {
            Centimeters = (i * 2.54);
            System.out.println(i+"\t"+ Centimeters);
        }
    }
}
