import java.util.Scanner;

public class GradeScale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student average: ");
        int avg = input.nextInt();
        System.out.printf("Quality Points assignment: %d%n", qualityPoints(avg));
    }
    
    public static int qualityPoints(int avg) {
        if (avg >= 90) return 4;
        if (avg >= 80) return 3;
        if (avg >= 70) return 2;
        if (avg >= 60) return 1;
        return 0;
    }
}