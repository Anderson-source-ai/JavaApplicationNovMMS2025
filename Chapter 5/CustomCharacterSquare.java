import java.util.Scanner;

public class CustomCharacterSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side dimensions: ");
        int side = input.nextInt();
        System.out.print("Enter character: ");
        char fill = input.next().charAt(0);
        
        squareOfCharacters(side, fill);
    }
    
    public static void squareOfCharacters(int side, char fillCharacter) {
        for (int r = 0; r < side; r++) {
            for (int c = 0; c < side; c++) {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }
}