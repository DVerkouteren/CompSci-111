package Project4;

public class TuitionCalculation {
    public static void main(String[] args) {
        double intialTuition = 10000;
        double interestRate = 6;
        double years = 10;
        double totalTuition;
        double simpleTuition;

        interestRate = (interestRate/100);
        
        double insdie = Math.pow(1+interestRate, years);

        totalTuition = intialTuition*insdie;
        totalTuition = Math.ceil(totalTuition*100)/100;
        System.out.println("You're compoud tuition in " + years + "years is $" + totalTuition);

        simpleTuition = (1 + interestRate) * years * intialTuition;
        simpleTuition = Math.ceil(simpleTuition*100)/100;
        System.out.println("You're simple tuitio is  $" + simpleTuition);


    }
}
