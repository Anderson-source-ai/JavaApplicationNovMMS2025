import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grossSales = 0;
        
        while (true) {
            System.out.print("Enter item number (1-4) or -1 to calculate earnings: ");
            int item = scanner.nextInt();
            if (item == -1) break;
            
            System.out.print("Enter quantity sold: ");
            int qty = scanner.nextInt();
            
            if (item == 1) grossSales += 239.99 * qty;
            else if (item == 2) grossSales += 129.75 * qty;
            else if (item == 3) grossSales += 99.95 * qty;
            else if (item == 4) grossSales += 350.89 * qty;
        }
        double earnings = 200.0 + (grossSales * 0.09);
        System.out.printf("Earnings: $%.2f%n", earnings);
    }
}