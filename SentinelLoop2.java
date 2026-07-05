import java.util.Scanner;

public class SentinelLoop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        double num;
        

        
        while(true) {
            System.out.print("Enter number: ");
            num = sc.nextDouble();
            
            if(num == -1) {
                break; 
            }
            
            if(num > 0) {
                positive++;
            } else if(num < 0) {
                negative++;
            } else {
                zeros++;
            }
        }
        
        System.out.println("\nResults:");
        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);
        System.out.println("Zeros = " + zeros);
        
        sc.close();
    }
}