import java.util.Scanner;

public class ClassWork4{

    public static void main(String[] args) {
        findAvg(); 
    }

    public static void findAvg() {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Insert the first number: ");
        int num1 = scan.nextInt();
        
        System.out.print("Insert the second number: ");
        int num2 = scan.nextInt();
        
        System.out.print("Insert the third number: ");
        int num3 = scan.nextInt();
        
        int Average = ((num1 + num2 + num3) / 3);
        
        System.out.println("The Average number is: " + Average);
        
        scan.close(); 
    }
}