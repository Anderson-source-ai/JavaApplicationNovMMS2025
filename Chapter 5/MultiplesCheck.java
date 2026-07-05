import java.util.Scanner;

public class MultiplesCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter pairs of integers (0 0 to exit):");
        
        while (true) {
            System.out.print("First integer: ");
            int base = input.nextInt();
            System.out.print("Second integer: ");
            int check = input.nextInt();
            
            if (base == 0 && check == 0) break;
            
            System.out.printf("Is %d a multiple of %d? %b%n%n", check, base, isMultiple(base, check));
        }
    }
    
    public static boolean isMultiple(int first, int second) {
        return second % first == 0;
    }
}