import java.util.Scanner;
import java.util.Random;

public class CrapsWager {
    private static final Random rand = new Random();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bankBalance = 1000.0;
        
        while (bankBalance > 0) {
            System.out.printf("Current Bank Balance: $%.2f%n", bankBalance);
            chatter();
            System.out.print("Enter your wager: ");
            double wager = input.nextDouble();
            
            while (wager <= 0 || wager > bankBalance) {
                System.out.print("Invalid Wager! Re-enter valid wager: ");
                wager = input.nextDouble();
            }
            
            boolean won = playCrapsGame();
            if (won) {
                bankBalance += wager;
                System.out.printf("You won! New Balance: $%.2f%n%n", bankBalance);
            } else {
                bankBalance -= wager;
                System.out.printf("You lost! New Balance: $%.2f%n%n", bankBalance);
            }
        }
        System.out.println("Sorry. You busted!");
    }
    
    public static boolean playCrapsGame() {
        int point = 0;
        int roll = rollDice();
        if (roll == 7 || roll == 11) return true;
        if (roll == 2 || roll == 3 || roll == 12) return false;
        
        point = roll;
        while(true) {
            int nextRoll = rollDice();
            if (nextRoll == point) return true;
            if (nextRoll == 7) return false;
        }
    }
    
    public static int rollDice() { return (1 + rand.nextInt(6)) + (1 + rand.nextInt(6)); }
    
    public static void chatter() {
        String[] quotes = {"Oh, you're going for broke, huh?", "Aw c'mon, take a chance!", "You're up big. Now's the time!"};
        System.out.println(quotes[rand.nextInt(quotes.length)]);
    }
}