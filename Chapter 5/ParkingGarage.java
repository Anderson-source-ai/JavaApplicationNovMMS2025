import java.util.Scanner;

public class ParkingGarage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0.0;
        
        System.out.println("Enter hours parked for a customer (or enter -1 to quit):");
        while (true) {
            System.out.print("Hours: ");
            double hours = input.nextDouble();
            if (hours < 0) break;
            
            double charge = calculateCharges(hours);
            totalReceipts += charge;
            
            System.out.printf("Current Customer Charge: $%.2f%n", charge);
            System.out.printf("Running Total Receipts: $%.2f%n%n", totalReceipts);
        }
    }
    
    public static double calculateCharges(double hours) {
        if (hours <= 3.0) return 2.00;
        double extraHours = Math.ceil(hours - 3.0);
        double total = 2.00 + (extraHours * 0.50);
        return Math.min(total, 10.00);
    }
}