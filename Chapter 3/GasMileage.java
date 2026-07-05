import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMiles = 0, totalGallons = 0;
        
        System.out.print("Enter miles driven : ");
        int miles = scanner.nextInt();
        
        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            int gallons = scanner.nextInt();
            
            totalMiles += miles;
            totalGallons += gallons;
            
            if (gallons != 0) {
                System.out.printf("Trip MPG: %.2f%n", (double) miles / gallons);
            }
            System.out.printf("Combined MPG: %.2f%n%n", (double) totalMiles / totalGallons);
            
            System.out.print("Enter miles driven (or -1 to quit): ");
            miles = scanner.nextInt();
        }
    }
}