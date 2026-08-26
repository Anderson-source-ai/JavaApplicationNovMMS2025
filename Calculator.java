import java.util.Scanner;

public class Calculator{

    public static void calculateNumbers() {
        Scanner scanner = new Scanner(System.in);

        double sum6to9 = 0;
        double sum2to4to9 = 0;
        double sum2to5 = 0;

        System.out.println("Please enter 10 numbers:");

        for (int count = 1; count <= 10; count++) {
            System.out.print("Enter number " + count + ": ");
            double num = scanner.nextDouble();

            if (count == 2 || count == 4 || count == 9) {
                sum2to4to9 = sum2to4to9 + num;
            }

            if (count >= 6 || count <= 9) {
                sum6to9 = sum6to9 + num;
            }

            if (count >= 2 && count <= 5) {
                sum2to5 = sum2to5 + num;
            }
        }

        if (sum2to5 == 0) {
            System.out.println("\nError: Cannot divide by zero because the sum of 2nd to 5th numbers is 0.");
        } else {
            double result = (sum6to9 + sum2to4to9) / sum2to5;

            System.out.println("\nResult");
            System.out.println("Sum of 6th to 9th: " + sum6to9);
            System.out.println("Sum of 2nd, 4th, 9th: " + sum2to4to9);
            System.out.println("Sum of 2nd to 5th: " + sum2to5);
            System.out.println("Final Answer: " + result);
        }
    }
    public static void main(String[] args) {
        calculateNumbers();
    }
}