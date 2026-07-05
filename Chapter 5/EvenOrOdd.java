import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers to evaluate (type a non-integer to exit):");
        
        while (input.hasNextInt()) {
            int num = input.nextInt();
            System.out.printf("%d is %s%n", num, isEven(num) ? "Even" : "Odd");
        }
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}