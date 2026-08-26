package school.service;

public class Part3_Loops {
    public double calculateTotal(double[] scores) {
        double total = 0;
        for (double score : scores) {
            total += score;
        }
        return total;
    }
}