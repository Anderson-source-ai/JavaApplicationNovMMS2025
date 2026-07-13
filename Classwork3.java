import java.util.Scanner;

public class ClassWork3{

    public static void main(String[] args) {
        findSmallest(); 
    }

    public static void findSmallest() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insert the first number: ");
        int num1 = scan.nextInt();
        
        System.out.println("Insert the second number: ");
        int num2 = scan.nextInt();
        
        System.out.println("Insert the third number: ");
        int num3 = scan.nextInt();
        
        int smallest = Math.min(num1, Math.min(num2, num3));
        
        System.out.println("The smallest number is: " + smallest);
        
        scan.close(); 
    }
}