import java.util.Random;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Random r = new Random();
        int rnum = r.nextInt(100) + 1; // Generate a random number between 1 and 100
        int nOfAtt = 0;
        boolean GuessedCorrectly = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");
        System.out.println();

        System.out.println("I have selected a number between 1 and 100.");
        System.out.println();
        System.out.println("Can you guess what it is?");
        System.out.println();

        while (!GuessedCorrectly) {
            System.out.print("Enter your guess: ");
            System.out.println();
            int userGuess = scanner.nextInt();
            nOfAtt++;

            if (userGuess < rnum) {
                System.out.println("Your guess is too low. Try again.");
                System.out.println();
            } else if (userGuess > rnum) {
                System.out.println("Your guess is too high. Try again.");
                System.out.println();
            } else {
                GuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println();
                System.out.println();
                System.out.println("It took you " + nOfAtt + " attempts.");
                System.out.println();
                System.out.println();
            }
        }

        scanner.close();
    }
}