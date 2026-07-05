import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of values you want to input: ");
        int numValues = input.nextInt();
        
        if (numValues <= 0) {
            System.out.println("Invalid digit.");
            return;
        }
        
        System.out.print("Enter integer 1: ");
        int smallest = input.nextInt();
        
        for (int i = 2; i <= numValues; i++) {
            System.out.printf("Enter integer %d: ", i);
            int value = input.nextInt();
            if (value < smallest) {
                smallest = value;
            }
        }
        
        System.out.printf("%nThe smallest value entered is: %d%n", smallest);
    }
}