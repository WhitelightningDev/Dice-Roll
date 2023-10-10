import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Initialize a scanner to read user input and a random number generator.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Variables to keep track of user and program wins.
        int userTotalWins = 0;
        int programTotalWins = 0;

        // Loop for 3 rounds of the game.
        for (int round = 1; round <= 3; round++) {
            System.out.println("Round : " + round);
            System.out.println("Press enter to roll your dice :");

            // Wait for the user to press enter before proceeding.
            scanner.nextLine();

            // Generate random numbers for user and program rolls (1 to 6).
            int userRoll = random.nextInt(6) + 1;
            int programRoll = random.nextInt(6) + 1;

            // Display the rolls.
            System.out.println("User rolled " + userRoll);
            System.out.println("Program rolled " + programRoll);

            // Determine the winner of the current round.
            if (userRoll > programRoll) {
                System.out.println("User wins this round\n");
                userTotalWins++;
            } else if (userRoll < programRoll) {
                System.out.println("Program wins this round\n");
                programTotalWins++;
            } else {
                System.out.println("It's a draw\n");
            }
        }

        // Determine the winner of the total rounds.
        if (userTotalWins < programTotalWins) {
            System.out.println("Program wins the total round\n");
        } else if (programTotalWins < userTotalWins) {
            System.out.println("User wins the total round\n");
        } else {
            System.out.println("It's a tie in the total rounds\n");
        }

        // Close the scanner to release resources.
        scanner.close();
    }
}
