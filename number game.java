import java.util.Random;
import java.util.Scanner;

public class number game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attempts = 5;
        int rounds = 1;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("\nRound " + rounds + ":");
            System.out.println("Guess the number between " + minRange + " and " + maxRange + ".");
            System.out.println("You have " + attempts + " attempts.");

            for (int attempt = 1; attempt <= attempts; attempt++) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();

                if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
                    score += attempts - attempt + 1;
                    break;
                }

                if (attempt == attempts) {
                    System.out.println("Out of attempts! The correct number was: " + targetNumber);
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }

            rounds++;
        }

        System.out.println("Thanks for playing!");
        System.out.println("Your total score is: " + score);
    }
}
