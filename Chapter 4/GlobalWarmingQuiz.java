import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        
        System.out.println("=================================================");
        System.out.println("      GLOBAL WARMING FACTS & SKEPTICS QUIZ       ");
        System.out.println("=================================================\n");
        
        System.out.println("Question 1: According to the IPCC, what is the primary driver of current climate change?");
        System.out.println("1. Volcanic activity\n2. Human-induced greenhouse gas emissions\n3. Solar radiation cycles\n4. Changes in Earth's orbit");
        System.out.print("Your answer (1-4): ");
        if (input.nextInt() == 2) score++;
        
        System.out.println("\nQuestion 2: Which argument is frequently used by global warming skeptics regarding climate history?");
        System.out.println("1. Earth's climate has always changed naturally, such as during the Medieval Warm Period\n2. Carbon dioxide does not trap heat\n3. The greenhouse effect is fictional\n4. Glaciers are growing everywhere");
        System.out.print("Your answer (1-4): ");
        if (input.nextInt() == 1) score++;
        
        System.out.println("\nQuestion 3: What role do greenhouse gases play in Earth's atmosphere?");
        System.out.println("1. Reflect solar energy\n2. Block UV rays\n3. Absorb and emit infrared radiation, trapping heat\n4. Cool down the surface");
        System.out.print("Your answer (1-4): ");
        if (input.nextInt() == 3) score++;
        
        System.out.println("\nQuestion 4: What is a major point of criticism from skeptics regarding global climate models?");
        System.out.println("1. They use no physics\n2. They simplify complex cloud feedback mechanisms and can overestimate sensitivity\n3. They ignore oceans\n4. They run on basic calculators");
        System.out.print("Your answer (1-4): ");
        if (input.nextInt() == 2) score++;
        
        System.out.println("\nQuestion 5: Who shared the 2007 Nobel Peace Prize for work on publicizing climate change facts?");
        System.out.println("1. Al Gore and the IPCC\n2. Greta Thunberg and the UN\n3. Bill Gates\n4. NASA");
        System.out.print("Your answer (1-4): ");
        if (input.nextInt() == 1) score++;
        
        System.out.printf("%nYour Score: %d / 5%n", score);
        if (score == 5) System.out.println("Excellent!");
        else if (score == 4) System.out.println("Very good!");
        else {
            System.out.println("Time to brush up on your knowledge of global warming.");
            System.out.println("References: climate.nasa.gov | www.ipcc.ch | www.skepticalscience.com");
        }
    }
}