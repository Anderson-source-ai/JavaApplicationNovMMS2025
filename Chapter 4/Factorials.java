public class Factorials {
    public static void main(String[] args) {
        System.out.printf("%-10s%s%n", "Number", "Factorial");
        System.out.println("---------------------------------");
        
        for (int i = 1; i <= 20; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.printf("%-10d%d%n", i, factorial);
        }
        
        System.out.println("\n-------------------------------------------------------------");
        System.out.println("What difficulty might prevent you from calculating 100!?");
        System.out.println("Answer: 100! overflows standard primitives like long.");
        System.out.println("You would need java.math.BigInteger to prevent arithmetic data corruption.");
    }
}