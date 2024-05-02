package Chapter6;

public class tempature {
    public static void main(String[] args) {
        double numF = toFahrenheit(35.0);
        System.out.println(numF);
    }
    public static double toFahrenheit(double num){
        return (num*(9.0/5.0) + 32);
    }
}
