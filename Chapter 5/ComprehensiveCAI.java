import java.util.Scanner;
import java.util.Random;

public class ComprehensiveCAI {
    private static final Random rand = new Random();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter difficulty level (1 = single digits, 2 = two digits): ");
            int diff = input.nextInt();
            System.out.print("Pick problem type (1=Add, 2=Sub, 3=Mul, 4=Div, 5=Mix): ");
            int type = input.nextInt();
            
            int correctCount = 0;
            
            for (int i = 0; i < 10; i++) {
                int n1 = generateNumber(diff);
                int n2 = generateNumber(diff);
                int activeType = (type == 5) ? (1 + rand.nextInt(4)) : type;
                
                int correctAnswer = getAnswer(n1, n2, activeType);
                printQuestion(n1, n2, activeType);
                
                int attempts = 0;
                while (true) {
                    int studentAns = input.nextInt();
                    if (studentAns == correctAnswer) {
                        printFeedback(true);
                        if (attempts == 0) correctCount++;
                        break;
                    } else {
                        printFeedback(false);
                        attempts++;
                        System.out.print("Try again: ");
                    }
                }
            }
            
            double score = (correctCount / 10.0) * 100;
            System.out.printf("%nPerformance evaluation score: %.1f%%%n", score);
            if (score >= 75.0) {
                System.out.println("Congratulations, you are ready to go to the next level!\n");
            } else {
                System.out.println("Please ask your teacher for extra help.\n");
            }
        }
    }
    
    public static int generateNumber(int level) {
        int max = (int) Math.pow(10, level);
        int min = (level == 1) ? 0 : (int) Math.pow(10, level - 1);
        return min + rand.nextInt(max - min);
    }
    
    public static int getAnswer(int n1, int n2, int type) {
        if (type == 1) return n1 + n2;
        if (type == 2) return n1 - n2;
        if (type == 3) return n1 * n2;
        return (n2 == 0) ? 0 : n1 / n2;
    }
    
    public static void printQuestion(int n1, int n2, int type) {
        char op = (type == 1) ? '+' : (type == 2) ? '-' : (type == 3) ? '*' : '/';
        System.out.printf("How much is %d %c %d? ", n1, op, n2);
    }
    
    public static void printFeedback(boolean isCorrect) {
        String[] pos = {"Very good!", "Excellent!", "Nice work!", "Keep up the good work!"};
        String[] neg = {"No. Please try again.", "Wrong. Try once more.", "Don't give up!", "Keep trying."};
        System.out.println(isCorrect ? pos[rand.nextInt(4)] : neg[rand.nextInt(4)]);
    }
}