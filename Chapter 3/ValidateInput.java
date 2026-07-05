import java.util.Scanner;

public class ValidateInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int passes = 0, failures = 0, counter = 1;
        
        while (counter <= 10) {
            int result = 0;
            while (result != 1 && result != 2) {
                System.out.print("Enter result (1 = pass, 2 = fail): ");
                result = scanner.nextInt();
            }
            if (result == 1) passes++;
            else failures++;
            counter++;
        }
        System.out.printf("Passed: %d, Failed: %d%n", passes, failures);
    }
}