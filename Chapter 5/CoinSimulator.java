import java.util.Scanner;
import java.util.Random;

public class CoinSimulator {
    enum Coin { HEADS, TAILS }
    private static final Random rand = new Random();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heads = 0, tails = 0;
        
        while (true) {
            System.out.println("1. Toss Coin\n2. Exit");
            System.out.print("Option: ");
            if (input.nextInt() != 1) break;
            
            Coin side = flip();
            if (side == Coin.HEADS) heads++;
            else tails++;
            
            System.out.printf("Tossed: %s | Total HEADS: %d | Total TAILS: %d%n%n", side, heads, tails);
        }
    }
    
    public static Coin flip() {
        return rand.nextBoolean() ? Coin.HEADS : Coin.TAILS;
    }
}