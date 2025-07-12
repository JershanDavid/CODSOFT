import java.util.Scanner;
import java.util.Random;


public class NumberGame {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          Random ra = new Random();
          int totalScore = 0;
          int round = 1;
          System.out.println("******* Welcome to the Number Game *******");
          boolean playAgain;
          do{
            int numberToGuess = ra.nextInt(100)+1;
            int attemptsLeft = 5;
            boolean guessedCorrectly = false;
            System.out.println("\nRound " + round + ":");
            System.out.println("Guess the number between 1 and 100. You have " + attemptsLeft + " attempts.");
            while(attemptsLeft>0){
                System.out.println("Enter Your Guess : ");
                int userGuess = sc.nextInt();
                attemptsLeft--;
                if(userGuess == numberToGuess){
                    System.out.println("Correct! You guessed the number!!");
                    guessedCorrectly = true;
                    totalScore += (6 - attemptsLeft);
                    break;
                }else if(userGuess < numberToGuess){
                    System.out.println("Too low! Attempts left : " + attemptsLeft);
                }else{
                    System.out.println("Too high! Attempts left : " + attemptsLeft);
                }
            }
            if(!guessedCorrectly){
                System.out.println("You've ran out of attempts! The number was " + numberToGuess);
            }
            System.out.println("Do you want to play again? (yes/no) : ");
            playAgain = sc.next().equalsIgnoreCase("yes");
            round++;
          }while(playAgain);
            System.out.println("\nGame Over! Your final score is : " + totalScore);
            System.out.println("Thank You for Playing!");
            sc.close();
        }
    }
