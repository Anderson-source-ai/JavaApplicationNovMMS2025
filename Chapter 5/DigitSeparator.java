import java.util.Scanner;

public class DigitSeparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer between 1 and 99999: ");
        int number = input.nextInt();
        
        displayDigits(number);
    }
    
    public static int getQuotient(int a, int b) { return a / b; }
    public static int getRemainder(int a, int b) { return a % b; }
    
    public static void displayDigits(int number) {
        int divisor = 10000;
        boolean started = false;
        
        while (divisor > 0) {
            int digit = getQuotient(number, divisor);
            if (digit > 0 || started || divisor == 1) {
                System.out.print(digit + "  ");
                started = true;
            }
            number = getRemainder(number, divisor);
            divisor = getQuotient(divisor, 10);
        }
        System.out.println();
    }
}