import java.util.Scanner;

public class TwoLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter integer: ");
            int num = scanner.nextInt();
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second) {
                second = num;
            }
        }
        System.out.printf("Largest: %d, Second: %d%n", largest, second);
    }
}