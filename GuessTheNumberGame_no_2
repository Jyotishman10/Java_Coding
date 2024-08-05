import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "Rock", "Paper", "Scissors" };

        while (true) {
            // Generate a random computer choice
            int computerChoiceIndex = random.nextInt(choices.length);
            String computerChoice = choices[computerChoiceIndex];

            // Ask the user for their choice
            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = scanner.nextLine();

            // Check for valid user input
            if (!isValidChoice(userChoice)) {
                System.out.println("Invalid choice. Please enter Rock, Paper, or Scissors.");
                continue;
            }

            // Determine the winner
            System.out.println("Computer chose: " + computerChoice);
            determineWinner(userChoice, computerChoice);

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    private static boolean isValidChoice(String choice) {
        return choice.equalsIgnoreCase("Rock") || choice.equalsIgnoreCase("Paper") || choice.equalsIgnoreCase("Scissors");
    }

    private static void determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors"))
                || (userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock"))
                || (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}

