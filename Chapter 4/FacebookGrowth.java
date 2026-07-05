public class FacebookGrowth {
    public static void main(String[] args) {
        double users = 1.0; 
        int monthsTo15 = 0, monthsTo20 = 0, months = 0;
        
        while (users < 2.0) {
            months++;
            users *= 1.04;
            if (users >= 1.5 && monthsTo15 == 0) monthsTo15 = months;
            if (users >= 2.0 && monthsTo20 == 0) monthsTo20 = months;
        }
        
        System.out.printf("Months to reach 1.5 Billion users: %d months%n", monthsTo15);
        System.out.printf("Months to reach 2.0 Billion users: %d months%n", monthsTo20);
    }
}