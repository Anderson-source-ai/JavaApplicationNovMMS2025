import java.util.Scanner;

public class AdvancedRounding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a double value to process: ");
        double value = input.nextDouble();
        
        System.out.printf("Original: %f%n", value);
        System.out.printf("Integer:  %d%n", roundToInteger(value));
        System.out.printf("Tenths:   %.1f%n", roundToTenths(value));
        System.out.printf("Hundredths: %.2f%n", roundToHundredths(value));
        System.out.printf("Thousandths: %.3f%n", roundToThousandths(value));
    }
    
    public static int roundToInteger(double number) { return (int) Math.floor(number + 0.5); }
    public static double roundToTenths(double number) { return Math.floor(number * 10 + 0.5) / 10; }
    public static double roundToHundredths(double number) { return Math.floor(number * 100 + 0.5) / 100; }
    public static double roundToThousandths(double number) { return Math.floor(number * 1000 + 0.5) / 1000; }
}