import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter decimal values to round (or enter -1 to exit):");
        
        while (true) {
            System.out.print("Number: ");
            double x = input.nextDouble();
            if (x == -1) break;
            
            double y = Math.floor(x + 0.5);
            System.out.printf("Original: %f -> Rounded to Integer: %.0f%n%n", x, y);
        }
    }
}