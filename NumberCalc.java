import java.util.Scanner;

public class NumberCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double sum = 0;
        double product = 1;
        double num;
        
        System.out.println("Enter 10 numbers:");
        
        for(int i = 1; i <= 10; i++) {
            System.out.print("Number " + i + ": ");
            num = sc.nextDouble();
            sum += num;
            product *= num;
        }
        
        double average = sum / 10;
        
        System.out.println("\nResults:");
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Product = " + product);
        
        sc.close();
    }
}