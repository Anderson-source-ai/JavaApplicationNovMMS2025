import java.util.Scanner;

public class MinimumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 decimal values: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        
        System.out.printf("Minimum value is: %f%n", minimum3(n1, n2, n3));
    }
    
    public static double minimum3(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }
}