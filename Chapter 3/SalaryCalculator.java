import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Employee %d - Enter hours: ", i);
            double hours = scanner.nextDouble();
            System.out.printf("Employee %d - Enter hourly rate: ", i);
            double rate = scanner.nextDouble();
            
            double pay = (hours <= 40) ? (hours * rate) : (40 * rate + (hours - 40) * rate * 1.5);
            System.out.printf("Gross Pay: $%.2f%n%n", pay);
        }
    }
}