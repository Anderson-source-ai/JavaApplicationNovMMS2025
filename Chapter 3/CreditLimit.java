import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter account number : ");
            int acc = scanner.nextInt();
            if (acc <= -1) break;
            
            System.out.print("Enter beginning balance: ");
            int base = scanner.nextInt();
            System.out.print("Enter total charges: ");
            int charges = scanner.nextInt();
            System.out.print("Enter total credits: ");
            int credits = scanner.nextInt();
            System.out.print("Enter credit limit: ");
            int limit = scanner.nextInt();
            
            int newBalance = base + charges - credits;
            System.out.printf("New Balance: $%d%n", newBalance);
            if (newBalance > limit) {
                System.out.println("Credit limit exceeded");
            }
        }
    }
}