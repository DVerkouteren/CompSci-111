package Chapter5;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        boolean quit = false;
        Scanner input = new Scanner(System.in);
        int score = 0;
        int guess = -2;
        while (!quit) {

            // generate random number
            int random = (int) (Math.random() * 101);
            // ask the user for guess
            System.out.println("Enter your guess between 0 and 100, type 'quit' to end program");

            String user = input.next();

            if(user.equals("quit")){
                quit = true;
                break;
            }else{

            guess = Integer.parseInt(user);

            }
            while (guess != random) {

                if (guess > random) {
                    System.out.println("Guess lower");
                } else if (guess < random) {
                    System.out.println("Guess higher");
                }
                guess = input.nextInt();
            }
            score++;

            System.out.println("You guessed it!, score: "+ score);
        }
        input.close();
    }
}
