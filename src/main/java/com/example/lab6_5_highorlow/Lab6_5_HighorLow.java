package com.example.lab6_5_highorlow;
import java.util.Random;
import java.util.Scanner;

public class Lab6_5_HighorLow {

        public static void main(String[] args) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            int min = 1;
            int max = 10;
            int randomNumber = random.nextInt(max - min + 1) + min;
            int userGuess;

            do {
                System.out.print("Guess the number (between 1 and 10 inclusive): ");

                if (scanner.hasNextInt()) {
                    userGuess = scanner.nextInt();

                    if (userGuess < min || userGuess > max) {
                        System.out.println("Please enter a number between 1 and 10.");
                    } else {
                        if (userGuess == randomNumber) {
                            System.out.println("Congratulations! You guessed the correct number.");
                            break;
                        } else if (userGuess < randomNumber) {
                            System.out.println("Too low. Try again.");
                        } else {
                            System.out.println("Too high. Try again.");
                        }
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();
                }
            } while (true);

            System.out.println("The random number was: " + randomNumber);
            scanner.close();
        }

}
