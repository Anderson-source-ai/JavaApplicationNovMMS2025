import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        while (true) {
            int secret = 1 + rand.nextInt(1000);
            int attempts = 0;
            System.out.println("%nGuess a number between 1 and 1000.");
            
            while (true) {
                System.out.print("Your guess: ");
                int guess = input.nextInt();
                attempts++;
                
                if (guess == secret) {
                    System.out.println("Congratulations. You guessed the number!");
                    if (attempts < 10) System.out.println("Either you know the secret or you got lucky!");
                    else if (attempts == 10) System.out.println("Aha! You know the secret!");
                    else System.out.println("You should be able to do better! (Binary search method takes max 10 tries).");
                    break;
                } else if (guess > secret) {
                    System.out.println("Too high. Try again.");
                } else {
                    System.out.println("Too low. Try again.");
                }
            }
            
            System.out.print("Play again? (1=Yes, 0=No): ");
            if (input.nextInt() != 1) break;
        }
    }
}