package guessinggame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Guess a number between 1 and 100: ");
            int userGuess = input.nextInt();
            numberOfTries++;

            if (userGuess == numberToGuess) {
                System.out.println(" Congratulations! You found the number in " + numberOfTries + " tries.");
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
    }
}