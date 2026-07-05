import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit");
        System.out.print("Select choice (1-2): ");
        int choice = input.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter Fahrenheit temp: ");
            double f = input.nextDouble();
            System.out.printf("Celsius equivalent: %.2f°C%n", celsius(f));
        } else {
            System.out.print("Enter Celsius temp: ");
            double c = input.nextDouble();
            System.out.printf("Fahrenheit equivalent: %.2f°F%n", fahrenheit(c));
        }
    }
    
    public static double celsius(double fahrenheit) { return 5.0 / 9.0 * (fahrenheit - 32); }
    public static double fahrenheit(double celsius) { return 9.0 / 5.0 * celsius + 32; }
}