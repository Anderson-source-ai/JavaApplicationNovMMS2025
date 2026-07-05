import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1, number, largest = Integer.MIN_VALUE;
        
        while (counter <= 10) {
            System.out.print("Enter integer: ");
            number = scanner.nextInt();
            if (number > largest) {
                largest = number;
            }
            counter++;
        }
        System.out.printf("Largest is %d%n", largest);
    }
}