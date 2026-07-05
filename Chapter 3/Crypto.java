import java.util.Scanner;

public class Crypto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 4-digit integer: ");
        int num = scanner.nextInt();
        
        int d1 = (num / 1000 + 7) % 10;
        int d2 = ((num / 100) % 10 + 7) % 10;
        int d3 = ((num / 10) % 10 + 7) % 10;
        int d4 = (num % 10 + 7) % 10;
        
        // Encrypt (Swap 1 with 3, 2 with 4)
        int encrypted = d3 * 1000 + d4 * 100 + d1 * 10 + d2;
        System.out.printf("Encrypted: %04d%n", encrypted);
        
        // Decrypt (Reverse swap then reverse math)
        int e1 = encrypted / 1000, e2 = (encrypted / 100) % 10;
        int e3 = (encrypted / 10) % 10, e4 = encrypted % 10;
        
        int orig1 = (e3 + 3) % 10, orig2 = (e4 + 3) % 10;
        int orig3 = (e1 + 3) % 10, orig4 = (e2 + 3) % 10;
        
        System.out.printf("Decrypted: %04d%n", orig1 * 1000 + orig2 * 100 + orig3 * 10 + orig4);
    }
}