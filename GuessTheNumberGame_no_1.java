import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame_no_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to Guess the Number!");
        System.out.println("I've selected a number between " + lowerBound + " and " + upperBound);

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int playerGuess = scanner.nextInt();
            attempts++;

            if (playerGuess == numberToGuess) {
                hasGuessedCorrectly = true;
            } else if (playerGuess < numberToGuess) {
                System.out.println("Try higher!");
            } else {
                System.out.println("Try lower!");
            }
        }

        System.out
                .println("Congratulations! You guessed the number " + numberToGuess + " in " + attempts + " attempts.");
        scanner.close();
    }
}