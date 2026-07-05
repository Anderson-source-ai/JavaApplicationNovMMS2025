public class TriangleHypotenuse {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%n", "Side 1", "Side 2", "Hypotenuse");
        System.out.printf("%.1f       %.1f       %.2f%n", 3.0, 4.0, hypotenuse(3.0, 4.0));
        System.out.printf("%.1f       %.1f      %.2f%n", 5.0, 12.0, hypotenuse(5.0, 12.0));
        System.out.printf("%.1f       %.1f      %.2f%n", 8.0, 15.0, hypotenuse(8.0, 15.0));
    }
    
    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}