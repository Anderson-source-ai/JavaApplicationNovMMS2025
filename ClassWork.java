import java.util.Scanner;

public class ClassWork{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num;
        int sum = 0;
        int average = 0;
        int product = 1;
        int i = 1;

        while(i <= 10){
            System.out.print("Enter number: ");
            num = scan.nextInt();

            sum += num;
            product *= num;
            i++;
        }

        average = sum / 10;

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
        System.out.println("Average = " + average);
        
        scan.close();
    }
}