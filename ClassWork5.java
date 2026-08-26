import java.util.Scanner;

public class ClassWork5 {

    public static void main(String[] args) {
        SumOfTenNumbers(); 
    }

    public static void SumOfTenNumbers() {
        Scanner scan = new Scanner(System.in);
        int sum = 0; 
        
        System.out.println("Please enter 10 numbers:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int currentNumber = scan.nextInt();
            
            sum += currentNumber; 
        }
        
        System.out.println("\nThe total sum of the 10 numbers is: " + sum);
        
    
    }
}