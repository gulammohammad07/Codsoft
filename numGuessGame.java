import java.util.Random;
import java.util.Scanner;

public class numGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random= new Random();
        int totalAttempts = 0;
        int totalRounds = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the NUmber Guessing Game ... ");

        while (playAgain){
            int guessNum = random.nextInt(100)+1; // It generates a random num between 1 to 100.
            int attempts =0;
            boolean correctGuess = false;
            totalRounds++;

            System.out.println("\n I have select a num between 1 to 100 . let see how smart you are...");
            System.out.println("\n Start the Guess.....");

//            Limited Attempts
            int maxAttempts = 10;

            while (attempts < maxAttempts && !correctGuess){
                System.out.println("\n Enter your guess (1-100) :");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess <1 || userGuess >100){
                    System.out.println("\n PLease guess a num between 1 to 100.");
                    continue;
                }

                if (userGuess == guessNum){
                    System.out.println("Congratulations ! you have guess the num "+guessNum+ " correctly.");
                    System.out.println("You are a genius ..");
                    correctGuess = true;
                }else if (userGuess < guessNum){
                    System.out.println("your guess is low, Try Again ");
                }else {
                    System.out.println("your guess is High, Try Again ");
                }
            }

            totalAttempts += attempts;

            if (!correctGuess){
                System.out.println("\n Sorry , you have cross the limit of attempts. The number is  "+ guessNum);
            }

            System.out.println("\n Attempts taken: " + attempts);
            System.out.println("Total attempts : " + totalAttempts);
            System.out.println("Total rounds played: " + totalRounds);

            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = sc.next().toLowerCase();

            if (!response.equals("yes")) {
                playAgain = false;
                System.out.println("\nThanks you playing...");
            }
        }

        sc.close();

        }

    }

