import java.util.Scanner;

public class FairTaxEstimator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] categories = {"Housing", "Food", "Clothing", "Transportation", "Education", "Health Care", "Vacations"};
        double totalExpenses = 0;
        
        System.out.println("--- FairTax Alternative Plan Estimator ---");
        for (String cat : categories) {
            System.out.printf("Enter your annual expenses for %s: ", cat);
            totalExpenses += input.nextDouble();
        }
        
        System.out.printf("%nTotal Annual Estimated Expenses:   $%,.2f%n", totalExpenses);
        System.out.printf("Estimated FairTax (23%% Inclusive): $%,.2f%n", totalExpenses * 0.23);
        System.out.printf("Estimated FairTax (30%% Exclusive): $%,.2f%n", totalExpenses * 0.30);
    }
}