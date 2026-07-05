import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle radius: ");
        double radius = input.nextDouble();
        System.out.printf("Area of circle: %.4f%n", circleArea(radius));
    }
    
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}