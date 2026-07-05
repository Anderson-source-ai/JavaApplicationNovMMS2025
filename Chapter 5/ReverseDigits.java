import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        System.out.printf("Reversed layout: %d%n", reverse(num));
    }
    
    public static int reverse(int val) {
        int rev = 0;
        while (val != 0) {
            rev = rev * 10 + (val % 10);
            val /= 10;
        }
        return rev;
    }
}