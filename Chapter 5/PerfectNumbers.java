public class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println("Perfect Numbers between 1 and 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)) {
                System.out.printf("%d is perfect. Factors: ", i);
                printFactors(i);
            }
        }
    }
    
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }
    
    public static void printFactors(int number) {
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) System.out.print(i + " ");
        }
        System.out.println();
    }
}