public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Finding Primes under 10,000 using Square Root method...");
        int count = 0;
        for (int i = 2; i < 10000; i++) {
            if (isPrimeSqrt(i)) count++;
        }
        System.out.printf("Found %d primes.%n", count);
    }
    
    // Efficient method checking up to sqrt(n)
    public static boolean isPrimeSqrt(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}