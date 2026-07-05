import java.util.Scanner;

public class AsteriskSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side dimensions: ");
        int side = input.nextInt();
        squareOfAsterisks(side);
    }
    
    public static void squareOfAsterisks(int side) {
        for (int r = 0; r < side; r++) {
            for (int c = 0; c < side; c++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}